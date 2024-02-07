package ex2;

public abstract class AnimalAvecPattes extends Animal{

	private int nbPattes;

	public int getNbPattes() {
		return nbPattes;
	}

	public void setNbPattes(int nbPattes) {
		this.nbPattes = nbPattes;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + nbPattes + " pattes.";
	}
}
