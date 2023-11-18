package exercicios.beecrowd;

import java.util.Scanner;

public class CarregaOuNaoCarrega1026 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
    		long u = input.nextLong();
    		long m = input.nextLong();
    		System.out.println(u ^ m);
    	}
		
		input.close();
	}

}
