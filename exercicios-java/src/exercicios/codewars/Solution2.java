package exercicios.codewars;

public class Solution2 {

	public String toCamelCase(String s) {
		
		char[] letras = s.toCharArray();
		String frase = "";
		
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] == '-' || letras[i] == '_') {
				letras[i+1] = Character.toUpperCase(letras[i+1]);
			}
			if (letras[i] != '-' && letras[i] != '_') {
				frase += letras[i];
			}
		}
		
		return frase;
		
	}
}
