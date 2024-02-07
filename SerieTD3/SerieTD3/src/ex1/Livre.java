package ex1;

public class Livre {

	private static final int NB_PAGES_NON_RENSEIGNE = -666;
	private static final String EDITEUR_DEFAUT = "Eds inconnu";

	private static int numLivre = 0;
	
	private int nbPages;
	private String titre;
	private String auteur;
	private String editeur;
	private int numero;
	
	public Livre(String titre, String auteur) {
		this(titre, auteur, EDITEUR_DEFAUT, NB_PAGES_NON_RENSEIGNE);
	}
	
	public Livre(String editeur, String titre, String auteur, int nbPages) {
		super();
		this.nbPages = nbPages;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	@Override
	public String toString() {
		return "Livre [nbPages=" + nbPages + ", titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur + "]";
	}

	
	
}
