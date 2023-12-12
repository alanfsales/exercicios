package exercicios.codewars;

public class Solution {

	public int solution(int number) {
		int soma = 0;
	     
	     for (int i = 1; i < number; i++) {
	    	 if (i % 3 == 0 || i % 5 == 0) {
				soma += i;
			}
		 }
	     
	     return soma;
	}
}