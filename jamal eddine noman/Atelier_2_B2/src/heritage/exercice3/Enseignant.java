package heritage.exercice3;

import java.util.Date;

public class Enseignant extends Personne {
	private String specialite;
	public Enseignant(String nom, String prenom, String adresse, String ville, Date dateNaissance, String specialite) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialite = specialite;
	}

   public String toString() {
	   return super.toString() + ", enseignant une spécialité : " + this.specialite;
   }
	@Override
	public void ecrirePersonne(String msg) {
		System.out.println(msg);
	}

}