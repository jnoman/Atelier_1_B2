package heritage.exercice2;

public class CompteEpargne extends CompteBancaire {
	private int tauxInteret;
	public CompteEpargne (long numeroDuCompte, double solde, int tauxInteret) {
		super(numeroDuCompte, solde);
		if (solde < 200) {
			throw new IllegalArgumentException(
			        "le solde du compte pr�vu �tre sup�rieur ou �gal � 200 DH ans, mais �tait " + solde);
		}
		else {
			this.solde = solde;
			this.tauxInteret = tauxInteret;
		}
	}
	
	public void calculerIinteretAnnuel() {
		System.out.println("L'int�r�t annuel est : " + (this.solde * this.tauxInteret)/100);
	}
	
	public String Afficher() {
		return "Compte �pargne, " + super.Afficher();
	}
}
