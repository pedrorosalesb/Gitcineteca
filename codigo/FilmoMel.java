// Source file: FilmoMel.java

public class FilmoMel {
	
	Actor			melGibson;
	Pelicula[] 		films;
	String 			reporte;
	
    public FilmoMel() {
    	
    	(melGibson = new Actor()).setNombre("Mel Gibson");
    	melGibson.setFilmografia(films = new Pelicula[3]);
    	(films[0] = new Pelicula()).setNombre("Por Siempre Joven");
    	(films[1] = new Pelicula()).setNombre("Maverick");
    	(films[2] = new Pelicula()).setNombre("El Patriota");
    	
    	reporte = "Actor: " 
    			+ melGibson.getNombre() + "\n"    			 
    			+ "Filmografia: " + "\n";
    			for(int i = 0; i < 3; i++){
    				reporte = reporte + "\t" 
    						+ (melGibson.getFilmografia(i)).getNombre() + "\n";
    			}
    			
    }
    
    public String toString(){
    	return this.reporte;
    }
    
    
    
}
