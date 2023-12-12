package exercicios.codewars;

public class Kata {

	public static String reverseWords(final String original) {
		String[] palavras = original.split(" ");
		String frase = "";
		
		for (int i = 0; i < palavras.length; i++) {
			if (!frase.equals("")) {
				frase += " ";
			}
			String palavraInvertida = new StringBuilder(palavras[i]).reverse().toString();
			frase += palavraInvertida;	
		}
		return frase;
	}
}
