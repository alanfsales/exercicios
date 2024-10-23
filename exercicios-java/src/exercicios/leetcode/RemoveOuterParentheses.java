package exercicios.leetcode;

//LeetCode
public class RemoveOuterParentheses {

	public static void main(String[] args) {
		
		String s = "(()())(())(()(()))";
		String resulto = "";
        int dentro = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (dentro > 0) {
                    resulto = resulto.concat(String.valueOf(c));
                }
                dentro++;
            } else {
                dentro--;
                if (dentro > 0) {
                	resulto = resulto.concat(String.valueOf(c));
                }
            }
        }

        System.out.println(resulto);
   
	}
}
