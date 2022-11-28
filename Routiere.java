package tp5;

import java.util.ArrayList;

public class Routiere extends Marchandise {
	ArrayList<Marchandise> cargaison = new ArrayList<Marchandise>(); 
	final float limite = 40000;


	public Routiere(float reference, float poids, float volume, float distance) {
		super(reference, poids, volume, distance);
	}

	public void ajouter(Marchandise r) {
		if(poids <= limite) {
			cargaison.add(r);
		}
		
	}
	public float cout() {
		return 4 * distance * poids;
	}
}

