// Source file: Compositor.java

public class Compositor {
    private int cveCompositor;
    private String nombre;
    private String nacionalidad;
    private TemaMusical obras[];
    
    Compositor() {
    }
    /**
       @roseuid 4558DA4602BF
     */
    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    /**
       @roseuid 4558ED2E0196
     */
    public String getNacion( ) {
    	return this.nacionalidad;
    }
    public void setNacion(String nacionalidad) {
    	this.nacionalidad = nacionalidad;
    }
    /**
       @roseuid 4558ED5502EE
     */
    public int getCve( ) {
    	return this.cveCompositor;
    }
    public void setCve(int clave ) {
    	this.cveCompositor = clave;
    }
    /**
       @roseuid 4558ED740290
     */
    public TemaMusical getObras(int indice) {
    	return this.obras[indice];
    }
    public void setObras(TemaMusical obra, int indice) {
    	this.obras[indice] = obra;
    }
    public TemaMusical[] getObras( ) {
    	return this.obras;
    }
    public void setObras(TemaMusical[] obras) {
    	this.obras = obras;
    }
}
