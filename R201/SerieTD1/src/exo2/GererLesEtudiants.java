package exo2;

public class GererLesEtudiants {

	public static void main(String[] args) {
		
		Etudiant etudiant1 = new Etudiant();
		System.out.println(etudiant1);
		System.out.println(etudiant1.nbAbs);
		
		etudiant1.afficherInformations();
      	etudiant1.ajouterAbsence();
      	etudiant1.afficherInformations();
	}

}
