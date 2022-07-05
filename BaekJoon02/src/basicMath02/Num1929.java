package basicMath02;

import java.util.Scanner;

public class Num1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = m; i <= n; i++) {
			
			boolean isTrue = true;
			
			if(i < 2) {
				continue;
			}
			
			if(i == 2) {
				System.out.println(i);
			}
			
			for(int j = 2; j < i; j++) {
				
				if(i % j == 0) {
					isTrue = false;
					break;
				}
			}
			if(isTrue == true) {
				System.out.println(i);
			}
		}
	}
}
