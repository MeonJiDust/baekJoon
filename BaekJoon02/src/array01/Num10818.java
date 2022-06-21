package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Num10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[num - 1]);
		
		sc.close();
		
	}

}
