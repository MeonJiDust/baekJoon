package repeat;

import java.util.Scanner;

public class Num10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 0 && b == 0) {
				break;
			}else {
				System.out.println(a + b);
			}
		}
	}

}
