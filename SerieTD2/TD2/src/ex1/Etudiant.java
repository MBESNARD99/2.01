package ex1;

public class Etudiant extends Personne {

	private int numero;
	
	public Etudiant(String nom, int numero) {
		super(nom); //La personen donne un nom dcp je refile le nom
		this.numero = numero; //Je m'occupe moi même du numéro
	}

	public int getNumero() {
		return numero;
	}
	
	@Override
	public String getNom() {
		return super.getNom() + "(ETU)";
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Etudiant))
			return false;
		Etudiant other = (Etudiant) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
}
