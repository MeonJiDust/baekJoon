package basicMath01;

import java.util.Scanner;

public class Num2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 1;
		int range = 2;
		
		if(num == 1) {
			System.out.println(1);
		}else {
			while(range <= num) {
				range  = range + (count * 6);
				count++;
			}
			System.out.println(count);
		}
	}

}
