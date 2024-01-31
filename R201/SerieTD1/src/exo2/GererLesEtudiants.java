package exo2;

public class GererLesEtudiants {

	public static void main(String[] args) {

//		Etudiant etudiant1 = new Etudiant();
//		System.out.println(etudiant1);
//		System.out.println(etudiant1.getNbAbs());
//
//		etudiant1.afficherInformations();
//		etudiant1.ajouterAbsence();
//		etudiant1.afficherInformations();
//
//		Etudiant etudiant2 = new Etudiant("Dubois", "Jean");
		Etudiant etudiant3 = new Etudiant("Durand", "Guillaume", "INFO");
		Etudiant etudiant4 = new Etudiant("Durand", "Guillaume", "INFO");
		System.out.println(etudiant3);
		System.out.println(etudiant4);

		System.out.println(etudiant3.egaleA(etudiant4));

	}

}
