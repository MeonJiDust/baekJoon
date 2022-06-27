package basicMath01;

import java.util.Scanner;

public class Num2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		if(num % 5 == 0) {
			count = num / 5;
		}else if(num % 5 == 1) {
			count = ((num / 5) - 1) + 2;
			
		}else if(num % 5 == 2) {
			count = ((num / 5) - 2) + 4;
		}else if(num % 5 == 3) {
			count = num / 5 + 1;
		}else if(num % 5 == 4) {
			count = ((num / 5) - 1) + 3;
			if(num == 4) {
				count = -1;
			}
		}
		if(num == 4 || num == 7) count = -1;
		
		System.out.println(count);

	}

}
