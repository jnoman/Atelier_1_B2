package heritage.exercice2;

public class CompteEpargne extends CompteBancaire {
	private int tauxInteret;
	public CompteEpargne (long numeroDuCompte, double solde, int tauxInteret) {
		super(numeroDuCompte, solde);
		if (solde < 200) {
			throw new IllegalArgumentException(
			        "le solde du compte prévu être supérieur ou égal à 200 DH ans, mais était " + solde);
		}
		else {
			this.solde = solde;
			this.tauxInteret = tauxInteret;
		}
	}
	
	public void calculerIinteretAnnuel() {
		System.out.println("L'intérêt annuel est : " + (this.solde * this.tauxInteret)/100);
	}
	
	public String Afficher() {
		return "Compte épargne, " + super.Afficher();
	}
}
