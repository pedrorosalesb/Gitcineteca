// Source file: TemaMusical.java

public class TemaMusical {
    private int cveTema;
    private String nombre;
    private Pelicula film;
    private Compositor autor;
    
    TemaMusical() {
    }
    /**
       @roseuid 4558D95B0203
     */
    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    /**
       @roseuid 4558D9CD0186
     */
    public Compositor getAutor() {
    	return this.autor;
    }
    public void setAutor(Compositor autor) {
    	this.autor = autor;
    }
    /**
       @roseuid 4558ED020242
     */
    public int getCve( ) {
    	return this.cveTema;
    }
    public void setCve(int clave ) {
    	this.cveTema = clave;
    }
}
