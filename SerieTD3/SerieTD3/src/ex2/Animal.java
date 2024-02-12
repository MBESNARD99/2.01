package ex2;

public abstract class Animal {
	
	public Animal(String race, double poids) {
		super();
		this.race = race;
		this.poids = poids;
	}

	private double poids;
	private String race;
	
	public double getPoids() {
		return poids;
	}
	
	public String getRace() {
		return race;
	}
	
	@Override
	public String toString() {
		return race + ", " + poids + " kg.";
	}
	
	
	
}
