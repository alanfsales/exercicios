package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int numerosPosistivos = 0;
		
		double[] numeros = new double[6];
		
		for (int i = 0; i < numeros.length; i++) {
			double numero = input.nextDouble();
			if(numero > 0) {
				numerosPosistivos++;
			}
			numeros[i] = numero;
		}
		
		System.out.println(numerosPosistivos + " valores positivos");
		
		input.close();
	}
}
