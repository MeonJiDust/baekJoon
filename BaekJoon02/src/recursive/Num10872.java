package recursive;

import java.util.Scanner;

public class Num10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mul = 1;
		
		for(int i = n; i > 0; i--) {
			mul *= i;
			
		}
		System.out.println(mul);
	}

}
