package basicMath01;

import java.util.Scanner;

public class Num2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		int cul = a - b;
		int result = 0;
		
		if(v % cul == 0) {
			if(v % a == 0) {
				result = v / cul -1;
			}else {
				result = v / cul;
			}
		}else {
			result = v / cul + 1;
		}
		System.out.println(result);
	}

}
