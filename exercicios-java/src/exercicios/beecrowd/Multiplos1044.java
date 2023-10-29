package exercicios.beecrowd;

import java.util.Scanner;

public class Multiplos1044 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		if(A > B) {
			if (A % B == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}else if (B > A) {
			if (B % A == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}else if (A == B) {
			System.out.println("Sao Multiplos");
		}
		
		input.close();
	}
}
