package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class PositivosEMedia1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int positivos = 0;
		float soma = 0;
		
		for (int i = 0; i < 6; i++) {
			float numero = input.nextFloat();
			if (numero > 0) {
				positivos++;
				soma += numero;
			}
		}
		
		System.out.println(positivos + " valores positivos");
		System.out.printf("%.1f%n",soma/positivos);
		
		input.close();
	}

}
