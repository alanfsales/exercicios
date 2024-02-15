package exercicios.beecrowd;

import java.util.Scanner;

public class ParesImparesPositivosNegativos1066 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		
		for (int i = 0; i < 5; i++) {
			int numero = input.nextInt();
			if (numero > 0) {
				positivo++;
			}else if (numero < 0){
				negativo++;
			}
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
		input.close();
	}

}
