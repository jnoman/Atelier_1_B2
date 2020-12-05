package heritage.exercice3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Secretaire secretaire = new Secretaire("nom1", "prenom1", "adresse1", "Safi", (Date)simpleDateFormat.parse("01/01/1980"), 1);
		Enseignant enseignant = new Enseignant("nom2", "prenom2", "adresse2", "Safi", (Date)simpleDateFormat.parse("01/01/1984"), "informatique");
		Etudiant etudiant = new Etudiant("nom3", "prenom3", "adresse3", "Safi", (Date)simpleDateFormat.parse("17/04/2000"), "Technicien Spécialisé en Développement Informatiques");
		secretaire.ecrirePersonne(secretaire.toString());
		enseignant.ecrirePersonne(enseignant.toString());
		etudiant.ecrirePersonne(etudiant.toString());
	}

}
