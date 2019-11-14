package persistencia;

import persistencia.interfaces.IPEstructuraArchivo;
import logica.DataArchivo;
import logica.EstructuraArchivos;
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
import logica.Campania;
import logica.DataMision;
import persistencia.interfaces.IPCampania;

public class PCampania implements IPCampania {

    public PCampania() {
    }


    @Override
    public void verPersistenciaCampania(Campania listaMisiones, String nombreCampania) {
        
        File archivo = null;
        FileReader frEA = null;
        BufferedReader brEA = null;

        try {
            //apertura del archivo
            archivo = new File(nombreCampania);
            frEA = new FileReader(archivo);
            brEA = new BufferedReader(frEA);
            String filaLeidaArchivo;
            String[] cadenaSeparada;
            
            while ((filaLeidaArchivo = brEA.readLine()) != null) {
                cadenaSeparada = filaLeidaArchivo.split(" ;;; ");

                DataMision m = new DataMision(cadenaSeparada[0], cadenaSeparada[1], cadenaSeparada[2]);
                listaMisiones.insertarMision(m);
                

                System.out.println(m);
                
            }

            brEA.close();
            frEA.close();

        } catch (Exception ee) {
            JOptionPane.showConfirmDialog(null, "El Archivo " + nombreCampania+ " no existe", "Información",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "PCampania{" + super.toString() + '}';
    }

}
