package exercices;

public class Institut extends EtablissementS{
	private String filiere;
	public Institut() {
		
	}
	public Institut(String leNom, String filiere) {
		super.setNom(leNom);
		this.filiere = filiere;
	}
	public Institut(String nom, String filiere, int nbetusiant) {
		super(nom,nbetusiant);
		this.filiere = filiere;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String toString() {
		return super.toString() + ", Nom de filiere est : " + this.filiere;
	}
}
