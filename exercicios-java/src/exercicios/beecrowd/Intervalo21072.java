package exercicios.beecrowd;

import java.util.Scanner;

public class Intervalo21072 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = 0;
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			x = input.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			}else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		input.close();
	}
}
