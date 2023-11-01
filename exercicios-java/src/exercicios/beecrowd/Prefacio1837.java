package exercicios.beecrowd;

import java.util.Scanner;

public class Prefacio1837 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int Q = 0;
		int R = 0;
		
		Q = A / B;
		R = A % B;
		System.out.println(Q + " "+ R);
		input.close();
	}
}
