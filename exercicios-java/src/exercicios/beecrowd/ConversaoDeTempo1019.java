package exercicios.beecrowd;

import java.util.Scanner;

public class ConversaoDeTempo1019 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int seg = 0;
		int min = 0;
		int hor = 0;
		
		hor = n / 60 /60;
		n = n - (hor * 60 *60);
		
		min = n / 60;
		n = n - (min * 60);
		
		seg = n;
		
		System.out.println(hor + ":" + min + ":" + seg);
		input.close();
	}
}
