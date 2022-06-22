package string;

import java.util.Scanner;

public class Num11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		
		for(int i = 0; i < length; i++) {
			
			int n = num.charAt(i) - '0';
			sum += n;
		}
		System.out.println(sum);
		
	}

}
