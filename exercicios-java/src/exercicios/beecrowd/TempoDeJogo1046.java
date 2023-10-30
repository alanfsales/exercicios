package exercicios.beecrowd;

import java.util.Scanner;

public class TempoDeJogo1046 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int inicio = input.nextInt();
		int fim = input.nextInt();
		int duracao = 0;
		
		if(inicio >= fim) {
			fim = fim + 24;
		}
		
		duracao = fim - inicio;
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
				
		input.close();
	}
}
