package exercice2;

public class Chien {
	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Chien(String nom) {
		this.setNom(nom);
	}
	public void aboyer(String sens) {
		System.out.print(sens + " - ");
	}
	public void manger(String qlqc) {
		System.out.println(qlqc);
	}
}
