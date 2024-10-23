package exercicios.leetcode;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[]  nums = {2,0,2,1,1,0};
		int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j]; //achei onde eu estava errando. tinha colocado coloquei j+1
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
		
		for (int i : nums) {
			System.out.println(i);
		}

	}

}
