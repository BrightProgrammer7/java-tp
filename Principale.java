package tp5;

import java.util.ArrayList;

public class Principale {
	ArrayList<Marchandise> cargaison = new ArrayList<Marchandise>(); 

	public static void main(String[] args) {
		Principale p = new Principale();
		p.ajouter(new Fluviale(1,1,1,1));
		p.ajouter(new Aerienne(1,1,1,1));
		p.ajouter(new Routiere(1,1,1,1));
		
		p.afficher();

	}
	
	private boolean ajouter(Marchandise m) {
		return cargaison.add(m);
	}

	public void afficher() {
		for(Marchandise m:cargaison)
			System.out.println("-- " + m);
	}
	
	

}
