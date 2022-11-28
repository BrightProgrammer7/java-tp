package tp5;

import java.util.ArrayList;

class Fluviale extends Marchandise {
	ArrayList<Marchandise> cargaison = new ArrayList<Marchandise>(); 

	final float limite = 300000;
	
	public Fluviale(float reference, float poids, float volume, float distance) {
		super(reference, poids, volume, distance);
	}
	

	public void ajouter(Marchandise f) {
		if(poids <= limite) {
			cargaison.add(f);
		}
	}
	
	public float cout() {
		return distance * poids;
	}
}

