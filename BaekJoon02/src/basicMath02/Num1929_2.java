package basicMath02;

import java.util.Scanner;

public class Num1929_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[] isTrue_arr = new boolean[n + 1];
		
		isTrue_arr[0] = true;
		isTrue_arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(isTrue_arr.length); i++) {
			
			if(isTrue_arr[i] == true) continue;
			for(int j = i * i; j < isTrue_arr.length; j += i) {
				
				isTrue_arr[j] = true;
			}
		}
		for(int i = m; i < isTrue_arr.length; i++) {
			
			if(isTrue_arr[i] == false) System.out.println(i);
		}
		
	}

}
