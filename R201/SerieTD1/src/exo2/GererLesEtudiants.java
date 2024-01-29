package exo2;

public class GererLesEtudiants {

	public static void main(String[] args) {
		
		Etudiant etudiant1 = new Etudiant();
		System.out.println(etudiant1);
		System.out.println(etudiant1.nbAbs);
		
		etudiant1.afficherInformations();
		etudiant1.ajouterAbsence();
		etudiant1.afficherInformations();
      	
      	Etudiant etudiant2= new Etudiant("2022-2", "Dubois","Jean");
    	Etudiant etudiant3= new Etudiant("2022-3", "Durand","Guillaume","INFO");
    	
    	etudiant2.afficherInformations();
    	etudiant3.afficherInformations();

	}

}
