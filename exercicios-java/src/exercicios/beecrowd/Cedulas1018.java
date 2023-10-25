package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Cedulas1018 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int N = input.nextInt();
		int resto = N;
		
		int nota100 =  N / 100;
		resto = resto - nota100 * 100;
		
		int nota50 = resto / 50;
		resto = resto - nota50 * 50;
		
		int nota20 = resto / 20;
		resto = resto - nota20 * 20;
		
		int nota10 = resto / 10;
		resto = resto - nota10 * 10;
		
		int nota5 = resto / 5;
		resto = resto - nota5 * 5;
		
		int nota2 = resto / 2;
		resto = resto - nota2 * 2;
		
		int nota1 = resto / 1;
		
		System.out.println(N);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");

		input.close();
	}

}
