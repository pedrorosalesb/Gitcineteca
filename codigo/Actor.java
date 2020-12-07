// Source file: Actor.java

public class Actor {
    private int cveActor;
    private String nombre;
    private double edad;
    private String nacionalidad;
    private Pelicula filmografia[];
    
    Actor() {
    }
    /**
       @roseuid 4558DC7203A9
     */
    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    /**
       @roseuid 4558DF2C03B9
     */
    public Pelicula getFilmografia(int indice) {
    	return this.filmografia[indice];
    }
    public void setFilmografia(Pelicula movie, int indice) {
    	this.filmografia[indice] = movie;
    }
    public Pelicula[] getFilmografia( ) {
    	return this.filmografia;
    }
    public void setFilmografia(Pelicula[] movies) {
    	 this.filmografia = movies;
    }
    /**
       @roseuid 4558E1AF03A9
     */
    public double getEdad() {
    	return this.edad;
    }
    public void setEdad(double edad) {
    	this.edad = edad;
    }
    /**
       @roseuid 4558E8D603C8
     */
    public int getCve( ) {
    	return this.cveActor;
    }
    public void setCve(int clave ) {
    	this.cveActor = clave;
    }
    /**
       @roseuid 4558EBC00109
     */
    public String getNacion( ) {
    	return this.nacionalidad;
    }
    public void setNacion(String nacionalidad) {
    	this.nacionalidad = nacionalidad;
    }
}
