package exercicios.beecrowd;

import java.util.Scanner;

public class TesteDeSelecao1035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String dados = input.nextLine();
		
		String[] numeros = dados.split(" ");
		
		int A = Integer.parseInt(numeros[0]);
		int B = Integer.parseInt(numeros[1]);
		int C = Integer.parseInt(numeros[2]);
		int D = Integer.parseInt(numeros[3]);
		
		
		if(B > C && D >A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
		input.close();
	}

}
