package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double valor = input.nextDouble();
		
		int nota100 = (int) (valor / 100);
		valor = valor % 100;
		
		int nota50 = (int) (valor / 50);
		valor = valor % 50;
		
		int nota20 = (int) (valor / 20);
		valor = valor % 20;
		
		int nota10 = (int) (valor / 10);
		valor = valor % 10;
		
		int nota5 = (int) (valor / 5);
		valor = valor % 5;
		
		int nota2 = (int) (valor / 2);
		valor = valor % 2;
		
		valor = valor *100;
		
		int moeda100 = (int) (valor / 100);
		valor = valor % 100;
		
		int moeda050 = (int) (valor / 50);
		valor = valor % 50;
		
		int moeda025 = (int) (valor / 25);
		valor = valor % 25;
		
		int moeda010 = (int) (valor / 10);
		valor = valor % 10;
		
		int moeda005 = (int) (valor / 5);
		valor = valor % 5;
		
		int moeda001 = (int) (valor / 1);
		valor = valor % 1;
		
		System.out.println("NOTAS:");
		System.out.println(nota100 + " nota(s) de R$ 100.00");
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(moeda100 + " moeda(s) de R$ 1.00");
		System.out.println(moeda050 + " moeda(s) de R$ 0.50");
		System.out.println(moeda025 + " moeda(s) de R$ 0.25");
		System.out.println(moeda010 + " moeda(s) de R$ 0.10");
		System.out.println(moeda005 + " moeda(s) de R$ 0.05");
		System.out.println(moeda001 + " moeda(s) de R$ 0.01");
		
		input.close();
	}
}
