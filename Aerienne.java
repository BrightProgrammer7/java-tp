package tp5;

import java.util.ArrayList;

class Aerienne extends Marchandise {
	ArrayList<Marchandise> cargaison = new ArrayList<Marchandise>(); 
	final float limite = 80000;

	
	public Aerienne(float reference, float poids, float volume, float distance) {
		super(reference, poids, volume, distance);
	}
	
	public void ajouter(Marchandise a) {
		if(volume <= limite) {
			cargaison.add(a);
		}
	}
	
	public float cout() {
		return 10 * distance * volume;
	}
}
