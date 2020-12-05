package heritage.exercice2;

public class Test {

	public static void main(String[] args) {
		CompteEpargne ce1 = new CompteEpargne(1, 100, 8);
		System.out.println(ce1.Afficher());
		ce1.calculerIinteretAnnuel();
	}

}
