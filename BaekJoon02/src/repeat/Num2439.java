package repeat;

import java.util.Scanner;

public class Num2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		
		for(int i = 1; i <= star; i++) {
			for(int j = star - i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
