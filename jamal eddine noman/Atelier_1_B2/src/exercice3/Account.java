package exercice3;

public class Account {
	private String nom, adresse; 
	private double solde;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Account(String nom, String adresse, double solde) {
		this.setNom(nom);
		this.setAdresse(adresse);
		this.setSolde(solde);
	}
	public void affichierInfoCompte(){
		System.out.println(this.getNom() + " habite à (" + this.getAdresse() + ") -infos solde "+ this.getSolde() + " DH");
	}
}
