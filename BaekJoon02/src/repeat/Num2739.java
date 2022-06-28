package repeat;

import java.util.Scanner;

public class Num2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

}
