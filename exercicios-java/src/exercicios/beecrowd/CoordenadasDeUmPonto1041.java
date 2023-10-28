package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class CoordenadasDeUmPonto1041 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String dados = input.nextLine();
		String[] cordenadas = dados.split(" ");
		
		float x = Float.parseFloat(cordenadas[0]);
		float y = Float.parseFloat(cordenadas[1]);
		
		if (x == 0.0 && y == 00) {
			System.out.println("Origem");
		}else if (x == 0.0 && y != 0.0) {
			System.out.println("Eixo Y");
		}else if (x != 0.0 && y == 0.0) {
			System.out.println("Eixo X");
		}else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		}else if (x < 0.0 && y > 00) {
			System.out.println("Q2");
		}else if (x < 0.0 && y < 00) {
			System.out.println("Q3");
		}
		
		input.close();
	}
}
