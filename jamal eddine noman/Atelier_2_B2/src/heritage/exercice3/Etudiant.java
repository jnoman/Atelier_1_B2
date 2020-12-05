package heritage.exercice3;

import java.util.Date;

public class Etudiant extends Personne {
	private String diplome;
	
	public Etudiant(String nom, String prenom, String adresse, String ville, Date dateNaissance, String diplome) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.diplome = diplome;
	}
	
	public String toString() {
		return super.toString() + ", préparant un diplôme : " + this.diplome;
	}

	@Override
	public void ecrirePersonne(String msg) {
		System.out.println(msg);
	}

}