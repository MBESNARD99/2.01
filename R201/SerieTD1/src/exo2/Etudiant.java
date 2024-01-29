package exo2;

public class Etudiant {
	private static final String FIRSTNAME_DEFAULT = "NO-FIRSTNAME";
	private static final String NAME_DEFAULT = "NO-NAME";
	private static final String NUM_DEFAULT = "NO-NUM";
	private static final String DPT_DEFAULT = "NON-COMMUNIQUÉ";
	public String numero;
	public String nom;
	public String prenom;
	public String departement;
	public int nbAbs;
	
	public Etudiant() {
		this(NUM_DEFAULT, NAME_DEFAULT, FIRSTNAME_DEFAULT);
	}
	
	public Etudiant(String numero, String nom, String prenom) {
		this(numero, nom, prenom, DPT_DEFAULT);
	}

	public Etudiant(String numero, String nom, String prenom, String departement) {
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
	}

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
		nbAbs++;
	}
	
	public void enleverAbsence() {
		nbAbs--;
	}
	
	public void modifierNom(String nouveauNom) {
		nom = nouveauNom;
	}
}
