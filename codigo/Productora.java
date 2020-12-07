// Source file: Productora.java

public class Productora {
    private int cveProductora;
    private String nombre;
    private Pelicula producciones[];
    
    Productora() {
    }
    /**
       @roseuid 4558D89B0119
     */
    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    /**
       @roseuid 4558EC0400DA
     */
    public int getCve( ) {
    	return this.cveProductora;
    }
    public void setCve(int clave ) {
    	this.cveProductora = clave;
    }
    /**
       @roseuid 4558EC2502EE
     */
    public Pelicula getProducciones(int indice) {
    	return this.producciones[indice];
    }
    public void setProducciones(Pelicula movie, int indice) {
    	this.producciones[indice] = movie;
    }
    public Pelicula[] getProducciones( ) {
    	return this.producciones;
    }
    public void setProducciones(Pelicula[] movies) {
    	this.producciones = movies;
    }
}
