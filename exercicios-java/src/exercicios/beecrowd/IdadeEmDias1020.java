package exercicios.beecrowd;

import java.util.Scanner;

public class IdadeEmDias1020 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int ano = 0;
		int mes = 0;
		int dia = 0;
		
		ano = n / 365;
		n = n - (ano * 365);
		
		mes = n / 30;
		n = n - (mes * 30);
		
		dia = n;
		
		System.out.println(ano + " anos(s)");
		System.out.println(mes + " mes(ses)");
		System.out.println(dia + " dia(s)");
		
		input.close();
	}
}
