package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String[]dados = input.nextLine().split(" ");
		
		float A = Float.parseFloat(dados[0]);
		float B = Float.parseFloat(dados[1]);
		float C = Float.parseFloat(dados[2]);
		float area = 0;
		
		if((A+B) > C && (A+C) > B && (B+C) > A) {
			System.out.println("Perimetro = " + (A+B+C));
		}else {
			area = ((A + B) * C) / 2;
			System.out.println("Area = " + area);
		}
		
		input.close();
	}
}
