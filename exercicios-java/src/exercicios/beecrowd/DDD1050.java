package exercicios.beecrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD1050 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Map<Integer, String> listaDDDs = new HashMap<>();
		listaDDDs.put(61, "Brasilia");
		listaDDDs.put(71, "Salvador");
		listaDDDs.put(11, "Sao Paulo");
		listaDDDs.put(21, "Rio de Janeiro");
		listaDDDs.put(32, "Juiz de Fora");
		listaDDDs.put(19, "Campinas");
		listaDDDs.put(27, "Vitoria");
		listaDDDs.put(31, "Belo Horizonte");
		
		Integer ddd = input.nextInt();
		String resultado = listaDDDs.get(ddd);
		
		if (resultado == null ) {
			System.out.println("DDD nao encontrado");
		}else {
			System.out.println(listaDDDs.get(ddd));
		}
		
		input.close();
	}
}
