package recursive;

import java.util.Scanner;

public class Num10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = function(n);
		System.out.println(sum);
	}

	private static int function(int n) {
		// TODO Auto-generated method stub
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return function(n - 1) + function(n - 2);
	}

}
