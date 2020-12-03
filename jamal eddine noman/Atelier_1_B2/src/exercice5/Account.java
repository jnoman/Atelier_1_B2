package exercice5;

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
	public void affichierInfoSolde(){
		System.out.println("infos solde "+ this.getSolde() + " DH");
	}
	public void calculerInterer(){
		System.out.println("ses intérêts est : "+ (this.getSolde() * 0.7) + " DH");
	}
}
