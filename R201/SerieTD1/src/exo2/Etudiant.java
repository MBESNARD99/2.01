package exo2;

public class Etudiant {

	// constantes
	private static final String FIRSTNAME = "NO-FIRSTNAME";
	private static final String LASTNAME = "NO-NAME";
	private static final String DPT_DEFAULT = "NON-COMMUNIQUÉ";
	private static final String ANNEE = "2023";

	// attributs de classe
	private static int cptEtud = 0;

	// attributs d'objets
	public String numero;
	public String nom;
	public String prenom;
	public String departement;
	public int nbAbs;

	public Etudiant() {
		this(LASTNAME, FIRSTNAME);
	}

	public Etudiant(String nom, String prenom) {
		this(nom, prenom, DPT_DEFAULT);
	}

	public Etudiant(String nom, String prenom, String departement) {
		this.numero = ANNEE + "-" + ++cptEtud;
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public int getNbAbs() {
		return nbAbs;
	}

	public void setNbAbs(int nbAbs) {
		this.nbAbs = nbAbs;
	}

	public static String getFirstnameDefault() {
		return FIRSTNAME;
	}

	public static String getNameDefault() {
		return LASTNAME;
	}

	public static String getDptDefault() {
		return DPT_DEFAULT;
	}

	public void afficherInformations() {
		System.out.println(
				"[" + numero + "] " + nom + " " + prenom + "(département " + departement + ") - nb d'abs : " + nbAbs);
	}

	public String toString() {
		return "[" + numero + "] " + nom + " " + prenom + "(département " + departement + ") - nb d'abs : " + nbAbs;
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
	
	public boolean egaleA(Etudiant autreEtudiant) {
		if (autreEtudiant == null)
			return false;
		return nom.equals(autreEtudiant.nom)
				&& prenom.equals(autreEtudiant.prenom)
				&& departement.equals(autreEtudiant.departement)
				&& nbAbs == autreEtudiant.nbAbs;
	}
}
