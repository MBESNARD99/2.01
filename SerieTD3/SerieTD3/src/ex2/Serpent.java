package ex2;

public class Serpent extends AnimalSansPatte{

	public static final boolean VENIMEUX = true;
	public static final boolean PAS_VENIMEUX = false;
	
	private boolean venimeux;

	public Serpent(String race, double poids, double longueur, boolean venimeux) {
		super(race, poids, longueur);
		this.venimeux = venimeux;
	}

	public boolean isVenimeux() {
		return venimeux;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + (venimeux?"":"pas ") + "v�nimeux";
	}
	
}
