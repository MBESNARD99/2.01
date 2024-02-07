package ex2;

public class Chien extends AnimalAvecPattes{

	private int categorie;
	
	public Chien(String race, double poids, int categorie) {
		super(race, poids);
		this.categorie = categorie;
	}

	public int getCategorie() {
		return categorie;
	}

	@Override
	public String toString() {
		return super.toString() + ", categorie " + categorie;
	}
}
