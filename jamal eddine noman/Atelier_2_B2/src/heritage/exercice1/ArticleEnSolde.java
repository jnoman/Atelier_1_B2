package heritage.exercice1;

public class ArticleEnSolde extends Article {
	private double pourcentage;

	public ArticleEnSolde(String nom, double prix, double pourcentage) {
		super(nom, prix);
		this.pourcentage = pourcentage;
	}
	public double calcule() {
		return this.pourcentage / 100 * super.getPrix();
	}
	public String afficher() {
		return super.afficher()+ ", la remise est : " + calcule() + " DH";
	}

}
