
package persistencia;

import logica.Historia;
import persistencia.interfaces.IPHistoria;


public class PHistoria implements IPHistoria{

    public PHistoria() {
    }
    
    
    
    public void verPersistenciaHistoria(Historia h){
                
                h.generarCampanias(4);
                for (int i=0; i<h.obtenerCantCampanias(); i++)
                    h.getListaCampanias().get(i).cargarPersistenciaCampania(i+"Campania.txt");
               
                
        
        
    }
    
   
    
    
    
}
