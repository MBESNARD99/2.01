package ex2;

public abstract class Animal {

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
