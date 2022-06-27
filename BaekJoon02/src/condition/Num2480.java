package condition;

import java.util.Scanner;

public class Num2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int price = 0;
		
		if(a == b && a == c && b == c) {
			price = 10000 + a * 1000;
		}else if(a == c || a == b) {
			price = 1000 + a * 100;
		}else if(b == c) {
			price = 1000 + b * 100;
		}else {
			price = Math.max(a, Math.max(b, c)) * 100;
		}
	}

}
