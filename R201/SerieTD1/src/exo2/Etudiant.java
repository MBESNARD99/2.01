package exo2;

public class Etudiant {
	public String numero;
	public String nom;
	public String prenom;
	public String departement;
	public String nbAbs = "0";
	
	public void afficherInformations() {
		System.out.println("[" + numero + "] "
				+ nom + " "
				+ prenom + "(département "
				+ departement + ") - nb d'abs : "
				+ nbAbs);
	}
	
	public String toString() {
		return "[" + numero + "] "
				+ nom + " "
				+ prenom + "(département "
				+ departement + ") - nb d'abs : "
				+ nbAbs;
	}
	
	public void ajouterAbsence() {
		nbAbs+=1;
	}
	
	public void enleverAbsence() {
		nbAbs-=1;
	}
	
	public void modifierNom(String nouveauNom) {
		nom = nouveauNom;
	}
}
