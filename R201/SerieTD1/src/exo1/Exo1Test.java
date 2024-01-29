package exo1;

public class Exo1Test {

	public static void main(String[] args) {
		//new Bidule();
		//Personne unePersonne = new Personne();
		//System.out.println(unePersonne.getNom());
		
		//Surcharge surcharge = new Surcharge();
		//surcharge.affiche();
		//surcharge.affiche("le groupe TD11 est meilleur que le groupe TD12");
		//surcharge.affiche(2, "non c'est pas vrai");
		
		//person aPerson = new person();
		
		//aPerson.setAge(10);
		//System.out.println(aPerson.getAge() +"(" + (aPerson.isMinor()?"mineur":"majeure") + ")");
		//System.out.println("minor ?" + aPerson.isMinor());
		
		//aPerson.setAge(20);
		//System.out.println(aPerson.getAge() +"(" + (aPerson.isMinor()?"mineur":"majeure") + ")");
		//System.out.println("minor ?" + aPerson.isMinor());
		
		Point p1 = new Point(5,2);
		p1.affiche();
		Point p2 = new Point(p1);
		p1.affiche();
		Point p3 = new Point(p1);
		p1.affiche();
	}
}
