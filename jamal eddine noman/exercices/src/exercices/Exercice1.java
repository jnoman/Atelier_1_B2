package exercices;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num=1;
		Scanner in = new Scanner(System.in);
		while(num!=0) {
			System.out.println("Entrez un nombre pour calculer la racine carr�e, ou bien 0 pour quit�");
			num = in.nextInt();
			if(num >= 1) {
				System.out.println("La r�sultat est : " + Math.sqrt(num));
			}
			else if(num == 0) {
				System.out.println("Fin de programme");
			}
			else {
				System.out.println("Les nombre n�gatif es invalide");
			}
		}
	}

}
