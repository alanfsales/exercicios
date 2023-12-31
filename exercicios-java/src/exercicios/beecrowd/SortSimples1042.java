package exercicios.beecrowd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortSimples1042 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String dados = input.nextLine();
		String[] numerosString = dados.split(" ");
		List<Integer> numeros = new ArrayList<>();
		List<Integer> listOrdenada = new ArrayList<>();
		
		for (int x = 0; x < numerosString.length; x++) {
			numeros.add(Integer.parseInt(numerosString[x]));
		}
		
		listOrdenada.addAll(numeros);
		Collections.sort(listOrdenada);
		
		for (Integer integer : listOrdenada) {
			System.out.println(integer);
		}
		
		System.out.println();
		
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
		
		input.close();
	}
}
