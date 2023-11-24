package exercicios.codewars;

import java.util.ArrayList;
import java.util.List;

public class isogram {
    public static boolean  isIsogram(String str) {
       List<Character> letras = new ArrayList<>();
		
       for (int i = 0; i < str.length(); i++) {
			    Character letra = Character.toLowerCase(str.charAt(i));
			    if (letras.contains(letra)) {
				    return false;
		    	}else {
				    letras.add(letra);
			    }
		    }

      return true;
      } 
}
