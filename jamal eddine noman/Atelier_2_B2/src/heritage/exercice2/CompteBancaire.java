package heritage.exercice2;

public class CompteBancaire {
	protected long numeroDuCompte; 
	protected double solde;
	public CompteBancaire(long numeroDuCompte, double solde) {
		this.numeroDuCompte = numeroDuCompte;
		this.solde = solde;
	}
	public void Ajouter(double solde) {
		this.solde = this.solde + solde;
	}
	public boolean Retirer(double solde) {
		if(this.solde >= solde) {
			this.solde = this.solde - solde;
			return true;
		}
		else {
			return false;
		}
	}
	public String Afficher() {
		return "Numéro du compte est : " + this.numeroDuCompte + ", le solde du compte est : " + this.solde + " DH";
	}
}
