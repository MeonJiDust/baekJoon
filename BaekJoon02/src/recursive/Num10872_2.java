package recursive;

import java.util.Scanner;

public class Num10872_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = factorial(n);
		System.out.println(sum);
	}
	public static int factorial(int n) {
	
		
//		if(n > 0){
//			mul *= n;
//			n--;
//			factorial(n);
//		}
//		return mul;
		if(n <= 1) return 1;
		return n * factorial(n - 1);
	}

}
