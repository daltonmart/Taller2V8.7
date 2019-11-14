
package logica.interfaces;

public interface ISistemaJuegoHistoria {
    public void sonido(String archivo);
    public String obtenerHistoriaUsuarioSesion();
    public String manejoComandoDeITerminal(String lineaTextoIngresada);
    public void avanceMision();
    public String getPrompt();
    
    public boolean jugadorGano();
    
    public boolean jugadorAlFinalDeCampania(int nroCampaniasDeHistoria);
}
