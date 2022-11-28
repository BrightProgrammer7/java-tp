package tp5;

public abstract class Marchandise {
	protected float reference,poids,volume,distance;
	// Marchandise référence poids volume 
	// Cargaison limite distance encombrement 
	// Aerienne Routiere Fluviale ajouter cout
	// Principale marchandises cargaison cout
	
	public Marchandise() {
	}

	public float getReference() {
		return reference;
	}

	public void setReference(float reference) {
		this.reference = reference;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}
	
	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}
	
	public Marchandise(float reference, float poids, float volume, float distance) {
		this.reference = reference;
		this.poids= poids;
		this.volume = volume;
		this.distance= distance;
	}
	
	public void affiche() {
		System.out.println("Hello Marchandise");
	}
	
	public abstract void ajouter(Marchandise r);
	public abstract float cout();
	

}


