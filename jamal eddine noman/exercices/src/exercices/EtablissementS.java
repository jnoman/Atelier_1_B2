package exercices;

public class EtablissementS {
	private String nom;
	private int nbetusiant;
	public EtablissementS() {
		
	}
	public EtablissementS(String nom, int nbetusiant) {
		this.nom = nom;
		this.nbetusiant = nbetusiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbetusiant() {
		return nbetusiant;
	}
	public void setNbetusiant(int nbetusiant) {
		this.nbetusiant = nbetusiant;
	}
	public String toString() {
		return "Nom de l'etablissement est : " + this.nom + " , Nombre de etudiant est : " + this.nbetusiant;
	}
}
