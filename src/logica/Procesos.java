
package logica;

import java.util.ArrayList;
import persistencia.PProcesos;
import persistencia.interfaces.IPProcesos;

public class Procesos {
    
    private ArrayList<Proceso> listaDeProceos;
    
    public Procesos(){
        this.listaDeProceos = new ArrayList<>();
    }
    
    public Procesos(ArrayList<Proceso> listaDeProcesos){
        this.listaDeProceos = listaDeProcesos;
    }
    
    //GETTERS
    public ArrayList<Proceso> getListaDeProcesos(){
        return this.listaDeProceos;
    }
    
    //SETTERS
    public void setListaDeProcesos(ArrayList<Proceso> listaDeProcesos){
        this.listaDeProceos = listaDeProcesos;
    }
    
    //MÉTODOS
    public void insertarProceso(Proceso p){
        listaDeProceos.add(p);
    }
    
    public void borrarProceso(Proceso p){
        listaDeProceos.remove(p);
    }
    
    public void cargarPersistenciaProcesos(String nombreUsuarios){
        
        IPProcesos pProcesos = new PProcesos();
        pProcesos.verPersistenciaProcesos(this, nombreUsuarios);
        
    }
    
}
