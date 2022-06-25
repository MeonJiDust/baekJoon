package basicMath01;

import java.util.Scanner;

public class Num2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for(int i = 0; i < test_case; i++) {
			
			int k = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;
			
			int[] arr = new int[n];
			
			for(int j = 0; j <= k; j++) {
				for(int q = 0; q < n; q++) {
					
					if(j == 0) {
						arr[q] = q + 1;
					}else {
						sum += arr[q];
						arr[q] = sum;
					}
				}
				sum = 0;
			}
			System.out.println(arr[n - 1]);
		}
	}

}
