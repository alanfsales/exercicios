package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBhaskara1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String dados = input.nextLine();
		
		String[] numeros = dados.split(" ");
		
		double A = Double.parseDouble(numeros[0]);
		double B = Double.parseDouble(numeros[1]);
		double C = Double.parseDouble(numeros[2]);
		
		double delta, R1, R2 = 0;
		
		delta = (B * B) - (4 * A * C);
		
		if(2 * A == 0 || delta<0){
			System.out.println("Impossivel calcular");
		}else {
			R1 = ((-1 * B) + Math.sqrt(delta)) / (2 * A);
			R2 = ((-1 * B) - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
			
		}
		input.close();
	}
}
