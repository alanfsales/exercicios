package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class TiposDeTriangulo1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextFloat();
		double B = input.nextFloat();
		double C = input.nextFloat();
		double aux = 0;
		
		if(A < B) {
			aux = A;
			A = B;
			B = aux;
		} 
		if(B < C) {
			aux = B;
			B = C;
			C = aux;
		}
		if(A < B) {
			aux = A;
			A = B;
			B = aux;
		}
		
		if (A >= B+C) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((A == B && B != C) || (A != B && B == C) || (A != B && A == C)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		input.close();
	}
}
