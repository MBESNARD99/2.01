package ex1;

import java.util.Objects;

public class Personne {
	
	private String nom;
	
	public Personne() {
		super();
	}
	
	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNom();
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Personne))
			return false;
		Personne other = (Personne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
}
