// Source file: Pelicula.java

public class Pelicula {
    private int cveProductora;
    private String nombre;
    private Productora compania;
    private TemaMusical soundtrack;
    private Actor[] reparto;
    
    Pelicula() {
    }
    /**
       @roseuid 4558D79C0148
     */
    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    /**
       @roseuid 4558D83A0196
     */
    public Productora getCompania() {
    	return this.compania;
    }
    public void setCompania(Productora compania) {
    	this.compania = compania;
    }
    /**
       @roseuid 4558D91C0186
     */
    public TemaMusical getSoundtrack() {
    	return this.soundtrack;
    }
    public void setSoundtrack(TemaMusical soundtrack) {
    	this.soundtrack = soundtrack;
    }
    /**
       @roseuid 4558DC30003E
     */
    public Actor getReparto(int indice) {
    	return this.reparto[indice];
    }
    public void setReparto(Actor interprete, int indice) {
    	this.reparto[indice] = interprete;
    }
    public Actor[] getReparto( ) {
    	return this.reparto;
    }
    public void setReparto(Actor[] reparto) {
    	this.reparto = reparto;
    }
    /**
       @roseuid 4558E17D0203
     */
    public int getCve( ) {
    	return this.cveProductora;
    }
    public void setCve(int clave ) {
    	this.cveProductora = clave;
    }
}
