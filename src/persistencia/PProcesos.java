
package persistencia;

import logica.Procesos;
import persistencia.interfaces.IPProcesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import logica.Proceso;
import logica.Procesos;


public class PProcesos implements IPProcesos{

    public PProcesos() {

    }

    @Override
    public void verPersistenciaProcesos(Procesos procesos, String nombreArchivo) {
        //Lectura de los datos del archivo
        File archivo;
        FileReader fr;
        BufferedReader br;
        
        try{
            //apertura del archivo
            archivo = new File (nombreArchivo);
            fr = new FileReader(archivo);
            br= new BufferedReader(fr);
            String filaLeidaArchivo;
            String [] cadenaSeparada;
            
            while ((filaLeidaArchivo = br.readLine())!= null){
                
                
                cadenaSeparada = filaLeidaArchivo.split(" ; ");
                
                Proceso p;
                
                System.out.println(cadenaSeparada[0]);

                p = new Proceso(Integer.valueOf(Integer.valueOf(cadenaSeparada[0])), Integer.valueOf(cadenaSeparada[1]), cadenaSeparada[2], cadenaSeparada[3], Boolean.valueOf(cadenaSeparada[4]));
                
                procesos.insertarProceso(p);
                
            }
            
            br.close();
            fr.close();
            
        }
        catch (Exception e){
            JOptionPane.showConfirmDialog(null,"El Archivo Procesos no existe", "Información",
                    JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void borrarArchivoDePersistenciaProcesos(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
