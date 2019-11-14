
package logica;


public class Proceso {
    private int pid;
    private int ppid;
    private String nombre;
    private Boolean activo;
    private String usuario;

    public Proceso() {
        
    }
    
    public Proceso(int pid, int ppid, String nombre, String usuario, Boolean activo) {
        this.pid = pid;
        this.ppid = ppid;
        this.nombre = nombre;
        this.usuario = usuario;
        this.activo = activo;
    }

    public int getPID() {
        return this.pid;
    }

    public void setPID(int pid) {
        this.pid = pid;
    }
    
    public int getPPID() {
        return this.ppid;
    }

    public void setPPID(int ppid) {
        this.ppid = ppid;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    public Boolean estaActivo(){
        return this.getActivo();
    }
    
}
