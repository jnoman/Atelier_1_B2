package constructeur.exercice1;
import java.time.YearMonth;


public class Employe {
	private String nom ,prenom ,adress ;
	private int anneeNaissance, anneeEncours;
	
	public Employe(String nom, String prenom, String adress, int anneeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adress = adress;
		this.anneeNaissance = anneeNaissance;
		this.anneeEncours = YearMonth.now().getYear();;
	}
	
	public int calculerAge() {
		return this.anneeEncours - this.anneeNaissance;
	}
	public void afficherInfosClient() {
		System.out.println(this.nom + " " + this.prenom + ", né le " + this.anneeNaissance + " habitant à " + this.adress);
	}
	
}
