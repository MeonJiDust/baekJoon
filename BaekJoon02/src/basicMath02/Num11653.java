package basicMath02;

import java.util.Scanner;

public class Num11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 2;
		
		while(n > 0) {
			
			if(n == 1) {
				break;
			}
			if(n % i == 0) {
				n /= i;
				System.out.println(i);
			}else {
				i++;
			}
		}
	}

}
