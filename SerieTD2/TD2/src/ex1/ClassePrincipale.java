package ex1;

public class ClassePrincipale {

	public static void main(String[] args) {
//		Personne unePersonne = new Personne("Evann");
//		Personne unePersonne = new Etudiant("Anonyme", 42);
//		unEtudiant.setNumero(7);
//		
//		Etudiant unAutreEtudiant = null;
//		if (unePersonne instanceof Etudiant) {
//			unAutreEtudiant = (Etudiant) unePersonne;
//		}
//		
//		unAutreEtudiant = (Etudiant) new Personne("John");
//		
//		System.out.println(unAutreEtudiant);
		
//		Personne personne1 = new Personne("John");
//		Personne personne2 = new Personne("John");
//		System.out.println(personne1.equals(personne2));
		
		Etudiant etudiant1 = new Etudiant("John", 1);
		Etudiant etudiant2 = new Etudiant("John", 2);
		System.out.println(etudiant1.equals(etudiant2));
	}
}
