package basicMath02;

import java.util.Scanner;

public class Num4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			boolean[] bool = new boolean[n * 2 + 1];
			int count = 0;
			
			bool[0] = bool[1] = true;
			
			for(int i = 2; i <= Math.sqrt(bool.length); i++) {
				
				if(bool[i] == true) {
					continue;
				}
				
				for(int j = i * i; j < bool.length; j += i) {
					
					bool[j] = true;
				}
			}
			
			for(int i = n + 1; i < bool.length; i++) {
				if(bool[i] == false) count++;
			}
			System.out.println(count);
			
		}
	}

}
