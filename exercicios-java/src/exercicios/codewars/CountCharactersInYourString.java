package exercicios.codewars;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInYourString {

	public Map<Character, Integer> count(String str) {
       
		Map<Character, Integer> letras = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			Character character = str.charAt(i);
			
			if (letras.containsKey(character)) {
				Integer integer = letras.get(character);
				integer++;
				letras.replace(character, integer);
			}else {
				letras.put(character, 1);
			}
		}
		
        return letras;
    }
}
