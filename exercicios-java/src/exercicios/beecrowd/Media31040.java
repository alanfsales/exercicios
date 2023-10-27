package exercicios.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Media31040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String dados = input.nextLine();
		String[] notas = dados.split(" ");
		
		float N1 = Float.parseFloat(notas[0]);
		float N2 = Float.parseFloat(notas[1]);
		float N3 = Float.parseFloat(notas[2]);
		float N4 = Float.parseFloat(notas[3]);
		
		float media = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / (2 + 3 + 4 + 1);
		System.out.printf("Media: %.1f%n", media);
		
		if(media >= 7 ) {
			System.out.println("Aluno aprovado.");
		}else if(media < 5) {
			System.out.println("Aluno reprovado.");
		}else if(media >=5 && media < 7) {
			System.out.println("Aluno em exame.");
			float notaExame = input.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			float mediaFinal = (media + notaExame) /2;
			if(mediaFinal >= 5) {
				System.out.println("Aluno aprovado.");
			}else if(mediaFinal < 5) {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", mediaFinal);
		}
		
		input.close();
	}
}
