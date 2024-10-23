package exercicios.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyStrings {

	public static void main(String[] args) {

		String A = "aa";
		String B = "aa";
		
		if (A.length() != B.length()) {
           // return false;
			System.out.println(false);
        }

        // Se as strings são iguais, precisamos verificar se há caracteres duplicados
        if (A.equals(B)) {
            Set<Character> seen = new HashSet<>();
            for (char c : A.toCharArray()) {
                if (!seen.add(c)) {
                    //return true; // Encontramos um caractere duplicado
                	System.out.println(true);
                }
            }
            //return false; // Sem caracteres duplicados
            System.out.println(false);
        }

        // Se as strings são diferentes, verificamos as posições das diferenças
        List<Integer> diffIndices = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diffIndices.add(i);
            }
        }

        // Precisamos exatamente de 2 diferenças para que seja possível trocar
//        return diffIndices.size() == 2 &&
//               A.charAt(diffIndices.get(0)) == B.charAt(diffIndices.get(1)) &&
//               A.charAt(diffIndices.get(1)) == B.charAt(diffIndices.get(0));
        
        System.out.println(diffIndices.size() == 2 &&
               A.charAt(diffIndices.get(0)) == B.charAt(diffIndices.get(1)) &&
             A.charAt(diffIndices.get(1)) == B.charAt(diffIndices.get(0)));
		
	}
}
