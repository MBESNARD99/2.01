package ex2;

public class AnimalSansPatte extends Animal {

	private double longueur;

	public AnimalSansPatte(String race, double poids, double longueur) {
		super(race, poids);
		this.longueur = longueur;
	}

	public double getLongueur() {
		return longueur;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + longueur + " cm";
	}
	
}
