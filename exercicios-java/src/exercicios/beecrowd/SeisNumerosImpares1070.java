package exercicios.beecrowd;

import java.util.Scanner;

public class SeisNumerosImpares1070 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		int quantidade = 0;
		
		for (int i = numero ; quantidade < 6; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				quantidade++;
			}
		}
		
		input.close();
	}

}
