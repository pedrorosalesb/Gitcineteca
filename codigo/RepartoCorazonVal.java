// Source file: RepartoCorazonVal.java

public class RepartoCorazonVal {
	
	Pelicula 		corazonVal;
	Productora 		twentiethCenturyFox;
	TemaMusical 	braveHeartSoundtrack;
	Compositor 		jamesHorner;
	Actor[] 		repartoEstelar;
	String 			reporte;
	
    public RepartoCorazonVal() {
    	
    	(corazonVal = new Pelicula()).setNombre("Corazon Valiente");
    	corazonVal.setCompania(twentiethCenturyFox = new Productora());
    	twentiethCenturyFox.setNombre("20th Century Fox");
    	corazonVal.setSoundtrack(braveHeartSoundtrack = new TemaMusical());
    	braveHeartSoundtrack.setNombre("Brave Heart Song");
    	braveHeartSoundtrack.setAutor(jamesHorner = new Compositor());
    	jamesHorner.setNombre("James Horner");
    	corazonVal.setReparto(repartoEstelar = new Actor[3]);
    	(repartoEstelar[0] = new Actor()).setNombre("Mel Gibson");
    	(repartoEstelar[1] = new Actor()).setNombre("Sophie Marceau");
    	(repartoEstelar[2] = new Actor()).setNombre("Catherine McCormack");
    	
    	reporte = "Pelicula: " 
    			+ corazonVal.getNombre() + "\n"
    			+ "Productora: "
    			+ twentiethCenturyFox.getNombre() + "\n"
    			+ "Tema: "
    			+ braveHeartSoundtrack.getNombre() + "\n"
    			+ "Autor: " 
    			+ jamesHorner.getNombre() + "\n"
    			+ "Reparto Estelar: " + "\n";
    			for(int i = 0; i < 3; i++){
    				reporte = reporte + "\t" 
    						+ (corazonVal.getReparto(i)).getNombre() + "\n";
    			}
    			
    }
    
    public String toString(){
    	return this.reporte;
    }
    
    
    
}
