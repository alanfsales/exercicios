package exercicios.codewars;

public class BitCounting {

	public int countBits(int n){
		
		String numero = Integer.toBinaryString(n);
		int um = 0;
		
		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '1') {
				um++;
			}
		}
		
		return um;
	}
}
