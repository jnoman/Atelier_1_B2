package constructeur.exercice1;

public class TestEmploye {

	public static void main(String[] args) {
		Employe e1 = new Employe("El alami","Mohammad","Casablanca",1963);
		Employe e2 = new Employe("El wahabi","Khalid","Safi",1990);
		Employe e3 = new Employe("Sbai","Sbai","Salé",2006);
		e1.afficherInfosClient();
		e2.afficherInfosClient();
		e3.afficherInfosClient();
		System.out.println("l'age est : " + e3.calculerAge());
	}

}
