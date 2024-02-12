package ex2;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chien leChien = new Chien("Labrador", 40.,1);
//		System.out.println(leChien);
		Canard leCanard = new Canard("Mulard", 4.);
//		System.out.println(leCanard);
		Serpent leSerpent = new Serpent("Serpent à sonnettes", 5., 300, Serpent.VENIMEUX);
//		System.out.println(leSerpent);
		
		LesAnimaux mesAnimaux = new LesAnimaux();
		mesAnimaux.ajouter(leChien);
		mesAnimaux.ajouter(leCanard);
		mesAnimaux.ajouter(leSerpent);
		System.out.println(mesAnimaux);
	}

}
