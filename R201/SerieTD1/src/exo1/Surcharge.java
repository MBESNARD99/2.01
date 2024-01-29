package exo1;

public class Surcharge {
	private static final String TEXTE_DEFAUT = "texte defaut";
	
	public void affiche(String texte) {
		System.out.println(texte);
	}
	
	public void affiche() {
		affiche(TEXTE_DEFAUT);
	}
	
	public void affiche(int nb, String texte) {
		if (nb<=0) {
			return;
		}
		for (int i=0; i < nb; i++) {
			affiche(texte);
		}
	}
}
