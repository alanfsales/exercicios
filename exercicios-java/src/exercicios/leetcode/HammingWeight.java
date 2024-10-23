package exercicios.leetcode;

public class HammingWeight {

	public static void main(String[] args) {
		int n = 128;
		String bin = Integer.toBinaryString(n);
		
		int res = 0;
		
		for (char c : bin.toCharArray()) {
			if(c == '1') {
				res++;
			}
		}
		
		System.out.println(res);
	}

}
