package exercicios.codewars;


//Não Resolvido
public class Solution2 {

	static String toCamelCase(String s) {
		
		char[] letras = s.toCharArray();
		String frase = "";
		
		for (int i = 0; i < letras.length; i++) {
			if((letras[i] != '-') || letras[i] != '_' ) {
				if(i > 0 && letras[i - 1] != '-') {
					frase += letras[i];
				}else {
					frase += Character.toUpperCase(letras[i]);;
				}
			}	
		}
		
		return frase;
	}

}
