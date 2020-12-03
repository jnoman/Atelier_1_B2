package exercice6;
import java.util.Scanner;
public class TextAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("El Alami Hassan ", "Safi", 14765.8);
		a1.affichierInfoSolde();
		a1.calculerInterer();
		double retirer;
		System.out.println("Entrer le montant du solde à retirer");
		Scanner in = new Scanner(System.in);
		retirer = in.nextDouble();
		a1.retirer(retirer);
		a1.affichierInfoSolde();
	}

}
