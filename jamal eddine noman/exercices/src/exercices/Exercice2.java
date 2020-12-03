package exercices;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X,Y;
		Scanner in = new Scanner(System.in);
		System.out.println("Entrez la somme du compte bancaire");
		X = in.nextInt();
		System.out.println("Entrez un nombre de mois");
		Y = in.nextInt();
		System.out.println("Le montant finale est : "+ (X * Y * 1.0001));
	}

}
