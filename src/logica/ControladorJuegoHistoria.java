
package logica;

import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import logica.TerminalLogica;
import logica.interfaces.ISistemaJuegoHistoria;
import static logica.ISistemaPrincipalImpl.historia;
import static logica.ISistemaPrincipalImpl.iJuego;
import static logica.ISistemaPrincipalImpl.iSesion;
import static logica.ISistemaPrincipalImpl.red;
import static logica.ISistemaPrincipalImpl.usuariosDelJuego;

public class ControladorJuegoHistoria implements ISistemaJuegoHistoria{
    
    public Clip clip;
    public String ruta = "/audios/";
    
    TerminalLogica t=new TerminalLogica();

    public ControladorJuegoHistoria() {
    }

    
    @Override
    public void sonido(String archivo){
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta+archivo+".wav")));
            clip.start();
        }
        catch(IOException | LineUnavailableException | UnsupportedAudioFileException e){
            
        }
    }

    public String obtenerHistoriaUsuarioSesion(){
        return historia.obtenerHistoriaDeCampania(iSesion.getNroCampania(),iSesion.getProgreso());
    }
    
    public String manejoComandoDeITerminal (String lineaTextoIngresada){
        t.setEntrada(lineaTextoIngresada);//usa la interfaz
        t.generarComandoYSalida();
        return t.getSalida();
    }
    
    public void avanceMision(){
        if (historia.obtenerComandoDeCampania(iSesion.getNroCampania(), iSesion.getProgreso()).equals(t.getEntrada())){//ingresa correctamente el comando
            if (iJuego.jugadorGano())
                JOptionPane.showConfirmDialog(null,"GANASTE, FELICITACIONES, Eres un PowerHack",
                        "PowerHack",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            else
                //Si llego al final de la campania
                if (iJuego.jugadorAlFinalDeCampania(iSesion.getNroCampania())){//Avanza a la campania siguiente
                    iSesion.setProgreso(0);
                    iSesion.setNroCampania(iSesion.getNroCampania()+1);
                    usuariosDelJuego.borrarPersistenciaUsuariosDelJuego(iSesion.getuEnSesion().getNickname());
                    usuariosDelJuego.escribirPersistenciaUsuariosDelJuego(iSesion.getuEnSesion().getNickname(),iSesion.getuEnSesion().getEmail(), iSesion.getuEnSesion().getContrasenia(), iSesion.getuEnSesion().getNroCampania(), iSesion.getuEnSesion().getProgreso());
                    JOptionPane.showConfirmDialog(null,"Felicitaciones!!!, Avanzaste a la campania "+iSesion.getNroCampania(),
                        "PowerHack",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
                    this.sonido(String.valueOf(iSesion.getNroCampania()));
                }
                else{
                    iSesion.setProgreso(iSesion.getProgreso()+1);
                    usuariosDelJuego.borrarPersistenciaUsuariosDelJuego(iSesion.getuEnSesion().getNickname());
                    usuariosDelJuego.escribirPersistenciaUsuariosDelJuego(iSesion.getuEnSesion().getNickname(),iSesion.getuEnSesion().getEmail(), iSesion.getuEnSesion().getContrasenia(), iSesion.getuEnSesion().getNroCampania(), iSesion.getuEnSesion().getProgreso());
                    
        }       }
        else{
            JOptionPane.showConfirmDialog(null,"Ese no es el comando correcto, vuelva a intentar ",
                        "PowerHack",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public String getPrompt() {
        UsuarioSesion us= red.getEquipoDelUsuario().getCompuestoPorUsuarios().buscarUsuarioConectado();
        
        String hostname = red.getEquipoDelUsuario().getdEquipo().getNombre()/*"localhost"*/;
        String chroot = us.getCompuestoPorArchivos().getDirectorioActual();
        String pwd = t.getPosicion();
        String usuario = us.getdUsrSesion().getNombre() /*"root"*/;
        String promptSep = "$ ";
                
        return usuario+"@"+hostname+":"+pwd+chroot+promptSep;
    }
    
    
    @Override
    public boolean jugadorGano(){
        return ( (iSesion.getuEnSesion().getNroCampania() == historia.obtenerCantCampanias()) && (iSesion.getuEnSesion().getProgreso() == historia.obtenerCantidadMisionesDeCampania(historia.obtenerCantCampanias())) );
    }
    
    @Override
    public boolean jugadorAlFinalDeCampania(int nroCampaniasDeHistoria){
        return ( iSesion.getuEnSesion().getProgreso() == historia.obtenerCantidadMisionesDeCampania(nroCampaniasDeHistoria) );
    }
    
}
