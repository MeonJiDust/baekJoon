package array01;

import java.util.Scanner;

public class Num2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int result = 0;
		
		for(int i = 0; i < 9; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		
		for(int i = 0; i < 9; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < 9; i++) {
			
			if(arr[i] == max) {
				result = i;
				break;
			}
		}
		
		System.out.println(max);
		System.out.println(result + 1);
	}

}
