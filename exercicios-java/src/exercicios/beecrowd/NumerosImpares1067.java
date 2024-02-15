package exercicios.beecrowd;

import java.util.Scanner;

public class NumerosImpares1067 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		
		for (int i = 0; i <= numero; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		input.close();
	}

}
