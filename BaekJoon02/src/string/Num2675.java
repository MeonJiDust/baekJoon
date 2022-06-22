package string;

import java.util.Scanner;

public class Num2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		
		for(int i = 0; i < test_case; i++) {
			
			int length = sc.nextInt();
			String str = sc.next();
			String new_str = "";
			
			for(int k = 0; k < str.length(); k++) {
				for(int j = 0; j < length; j++) {
					
					new_str += str.charAt(k);
				}
			}
			System.out.println(new_str);
		}
		
	}

}
