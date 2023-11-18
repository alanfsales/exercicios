package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double salario = input.nextFloat();
		double inposto = 0;
		double diferenca = 0;
		
		if (salario > 4500) {
			inposto = (1000 *0.08) + (1500 * 0.18);
			diferenca = salario - 4500;
			inposto += diferenca * 0.28;
		}else if (salario > 3000 && salario <= 4500 ) {
			inposto = (1000 * 0.08);
			diferenca = salario - 3000;
			inposto += diferenca * 0.18;
		} else if (salario > 2000 && salario <= 3000) {
			diferenca = salario - 2000;
			inposto += diferenca * 0.08;
		}
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$ %.2f%n", inposto);
		}
		
		input.close();
	}
}
