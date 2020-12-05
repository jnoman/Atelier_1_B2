package heritage.exercice3;

import java.util.Date;

public class Secretaire extends Personne {
   private int numeroBureau;
   public Secretaire(String nom, String prenom, String adresse, String ville, Date dateNaissance, int numeroBureau) {
	super(nom, prenom, adresse, ville, dateNaissance);
	this.numeroBureau = numeroBureau;
   }

   public String toString() {
      return super.toString() + ", numéro de bureau est : " + this.numeroBureau;
   }

   @Override
   public void ecrirePersonne(String msg) {
	   System.out.println(msg);
   }

}