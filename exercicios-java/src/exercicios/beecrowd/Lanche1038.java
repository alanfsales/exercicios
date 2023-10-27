package exercicios.beecrowd;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Lanche1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Map<Integer, Double> produtos = new HashMap<>();
		produtos.put(1, 4.00);
		produtos.put(2, 4.50);
		produtos.put(3, 5.00);
		produtos.put(4, 2.00);
		produtos.put(5, 1.50);
		
		String dados = input.nextLine();
		String[] numeros = dados.split(" ");
		
		Integer codigo = Integer.parseInt(numeros[0]);
		Integer quantidade = Integer.parseInt(numeros[1]);
		
		double valor = produtos.get(codigo);
		double valorTotal = valor * quantidade;
		
		System.out.printf("Total: R$ %.2f%n", valorTotal);
		
		input.close();
	}
}
