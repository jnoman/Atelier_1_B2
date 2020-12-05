package heritage.exercice3;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Personne {
   private String nom;
   private String prenom;
   private String adresse;
   private String ville;
   private java.util.Date dateNaissance;
   
   public Personne(String nom, String prenom, String adresse, String ville, Date dateNaissance) {
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.ville = ville;
	this.dateNaissance = dateNaissance;
   }

   public String toString() {
	   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	   return nom + " " + prenom + ", né le " + simpleDateFormat.format(dateNaissance) + " habitant à "+ adresse + " " + ville;
   }
   
   public void modifierPersonne(String adresse, String ville) {
      this.adresse = adresse;
      this.ville = ville;
   }
   
   public abstract void ecrirePersonne(String msg);

}