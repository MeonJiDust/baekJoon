package array01;

import java.util.Scanner;

public class Num2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mul = a * b * c;
		
		int[] arr = new int[10];
		
		String str = Integer.toString(mul);
		
		for(int i = 0; i < str.length(); i++) {
			
			arr[(int)str.charAt(i) - '0']++;
		}
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(arr[i]);
		}
	}

}
