package heritage.exercice2;

public class CompteCourant extends CompteBancaire {

	public CompteCourant(long numeroDuCompte, double solde) {
		super(numeroDuCompte, solde);
	}
	public String Afficher() {
		return "Compte Courant, " + super.Afficher();
	}
}
