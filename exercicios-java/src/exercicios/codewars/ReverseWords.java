package exercicios.codewars;

public class ReverseWords {

	//Não resolvido
	public static String reverseWords(String original) {
		String[] palavras = original.split(" ");
		String frase = "";
		
		for (String p : palavras) {
			if (frase.length() != 0 ) {
				frase += " ";
			}
			String palavraInvertida = new StringBuilder(p).reverse().toString();
			frase += palavraInvertida;	
		}
		return frase;
	}
	
//	public static String reverseWords(String original) {
//		String[] palavras = original.split(" ");
//		List<String> frase = new ArrayList<>();
//		
//		for (String p : palavras) {
//			StringBuilder sb = new StringBuilder();
//			sb.append(p);
//			sb = sb.reverse();
//			frase.add(sb.toString());
//		}
//		return String.join(" ", frase);
//	}
}
