package ex2;

import java.util.ArrayList;
import java.util.List;

public class LesAnimaux {

	private List<Animal> listAnimaux;

	public LesAnimaux() {
		super();
		listAnimaux = new ArrayList<>();
	}
	
	public void ajouter(Animal unAnimal) {
		listAnimaux.add(unAnimal);
	}

	@Override
	public String toString() {
		String res = "Voici les animaux de la liste :";
		
		for (Animal unAnimal: listAnimaux) {
			res += "\n\t- " + unAnimal;
		}
		
		return res;
	}
}
