package exercicios.beecrowd;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TempoDeUmEvento1061 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// pega a data e hora inicial
		int diaInicio = Integer.parseInt(input.nextLine().split(" ")[1]);
		String horaInicioEntrada = input.nextLine().replaceAll(" ", "");

		// pega a data e hora final
		int diaFIm = Integer.parseInt(input.nextLine().split(" ")[1]);
		String horaFimEntrada = input.nextLine().replaceAll(" ", "");

		// separa a hora Inicial
		String[] horaInicio = horaInicioEntrada.split(":");
		int hhI = Integer.parseInt(horaInicio[0]);
		int mmI = Integer.parseInt(horaInicio[1]);
		int ssI = Integer.parseInt(horaInicio[2]);

		// seprara a hora Final
		String[] horaFim = horaFimEntrada.split(":");
		int hhF = Integer.parseInt(horaFim[0]);
		int mmF = Integer.parseInt(horaFim[1]);
		int ssF = Integer.parseInt(horaFim[2]);

		// monta a data inicial
		LocalDateTime inicio = LocalDateTime.of(2023, Month.DECEMBER, diaInicio, hhI, mmI, ssI);

		// monta a data final
		LocalDateTime fim = LocalDateTime.of(2023, Month.DECEMBER, diaFIm, hhF, mmF, ssF);

		// calcula os dias, horas, minutos e seguntos
		Long dias = inicio.until(fim, ChronoUnit.DAYS);
		Long horas = inicio.until(fim, ChronoUnit.HOURS) - (dias * 24);
		Long min = (inicio.until(fim, ChronoUnit.MINUTES) - (dias * 24 * 60)) - horas * 60;
		Long seg = ((inicio.until(fim, ChronoUnit.SECONDS) - (dias * 24 * 60 * 60)) - horas * 60 * 60) - min * 60;

		// mostra o resusltado
		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(min + " minuto(s)");
		System.out.println(seg + " segundo(s)");

		input.close();
	}

}
