
package logica;

import java.util.ArrayList;
import persistencia.PCampania;
import persistencia.interfaces.IPCampania;

public class Campania {
    //private int progreso;
    private ArrayList<DataMision> listaMisiones;
    
    public Campania(){
        listaMisiones = new ArrayList<>();
    }

    public Campania(ArrayList<DataMision> listaMisiones, int cantMisiones) {
        this.listaMisiones = listaMisiones;
    }
   

    public int obtenerCantMisiones() {
        return listaMisiones.size()-1;
    }

    
    
    public ArrayList<DataMision> getlistaMisiones() {
        return listaMisiones;
    }

    public void setlistaMisiones(ArrayList<DataMision> compuestoPorMision) {
        this.listaMisiones = compuestoPorMision;
    }
    
    
    public void insertarMision(DataMision u){
        listaMisiones.add(u);
    }
    
    public void borrarMision(DataMision u){
        listaMisiones.remove(u);
    }

    public DataMision obtenerMision(int progreso){
        return listaMisiones.get(progreso);
    }
    
    public boolean esFinalCampania(){
        return listaMisiones.isEmpty();
    }

    
     public void cargarPersistenciaCampania(String nombreArchivo) {
        IPCampania pCampania = new PCampania();
        pCampania.verPersistenciaCampania(this, nombreArchivo);
    }
     
    @Override
    public String toString() {
        return "Campania{" + "listaMisiones=" + listaMisiones + '}';
    }
    
    
}
