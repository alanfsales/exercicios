package exercicios.leetcode;

public class Exercicio02 {

	public static void main(String[] args) {
		String num = "10200";
		int k = 1;
		
		String resultado = "";
		String num2 = num.substring(k);
		char[] nums = num2.toCharArray();
		int n = nums.length;
		
		if (!num2.isBlank()) {
			if(nums[n - 1] != '0') {
				for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - 1 - i; j++) {
		                if (nums[j] > nums[j + 1]) {
		                    char temp = nums[j]; 
		                    nums[j] = nums[j + 1];
		                    nums[j + 1] = temp;
		                }
		            }
		        }
			}else {
				resultado = num2;
			}
	  
	        resultado = String.copyValueOf(nums);
		}else {
			resultado = "0";
		}

        System.out.println(resultado);
        
        //pelo o que eu entedi da questão era pra retornar 1229, esse é o menor inteiro com esses numeros.
        
	}
}
