package exercicios.beecrowd;

import java.util.Scanner;

public class ParesEntreCincoNumeros1065 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pares = 0;
		
		for (int i = 0; i < 5; i++) {
			int numero = input.nextInt();
			if (numero % 2 == 0) {
				pares++;
			}
		}
		
		System.out.println(pares + " valores pares");
		
		input.close();
	}
}
