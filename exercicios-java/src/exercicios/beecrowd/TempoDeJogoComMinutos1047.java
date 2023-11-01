package exercicios.beecrowd;

import java.util.Scanner;

public class TempoDeJogoComMinutos1047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int horaInicial = input.nextInt();
		int minutoInicial = input.nextInt();
		int horaFinal = input.nextInt();
		int minutoFinal = input.nextInt();
		
		int horas = horaFinal - horaInicial;
		int minutos = minutoFinal - minutoInicial;
		
		if (horaFinal <= horaInicial && minutoFinal <= minutoInicial) {
			horas += 24;
		}
		
		if (minutoFinal < minutoInicial) {
			minutos += 60;
			horas--;
		}
		
		int minTotal = horas * 60 + minutos;
		
		if (minTotal <= 1440) {
			horas = minTotal / 60;
			minutos = minTotal % 60;
		}else {
			horas = 1440;
			minutos = 0;
		}
		
		System.out.println("O JOGO DUROU " + horas + 
				" HORA(S) E " + minutos+ " MINUTO(S)");
		
		input.close();
	}
}
