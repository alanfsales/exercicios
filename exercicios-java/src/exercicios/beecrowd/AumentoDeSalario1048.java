package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class AumentoDeSalario1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		float salario = input.nextFloat();
		
		if (salario > 0 && salario <= 400 ) {
			float reajuste = salario * 0.15f;
			float novoSalario = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15 %");
			
		}else if (salario > 400 && salario <= 800) {
			float reajuste = salario * 0.12f;
			float novoSalario = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12 %");
			
		}else if (salario > 800 && salario <= 1200) {
			float reajuste = salario * 0.10f;
			float novoSalario = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10 %");
			
		}else if (salario > 1200 && salario <= 2000) {
			float reajuste = salario * 0.07f;
			float novoSalario = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7 %");
		}else if (salario > 2000) {
			float reajuste = salario * 0.12f;
			float novoSalario = salario + reajuste;
			
			System.out.printf("Novo salario: %.2f%n", novoSalario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4 %");
		}
		
		input.close();
	}
}
