
package persistencia.interfaces;

import logica.Procesos;

public interface IPProcesos {
    public void verPersistenciaProcesos(Procesos procesos, String nombreArchivo);
    public void borrarArchivoDePersistenciaProcesos(String nombre);
}