package array01;

import java.util.Scanner;

public class Num3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int[] arr_compar = new int[42];
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
			
			arr_compar[(arr[i] % 42)]++;
		}
		
		for(int i = 0; i < 42; i++) {
			
			if(arr_compar[i] != 0) result++;
		}
		
		System.out.println(result);
	}

}
