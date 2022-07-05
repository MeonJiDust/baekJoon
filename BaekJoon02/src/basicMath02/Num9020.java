package basicMath02;

import java.util.Scanner;

public class Num9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for(int i = 0; i < test_case; i++) {
			
			int n = sc.nextInt();
			
			boolean[] isTrue = new boolean[n + 1];
			
			isTrue[0] = isTrue[1] = true;
			
			for(int j = 2; j < Math.sqrt(isTrue.length); j++) {
				
				if(isTrue[j] == true) continue;
				
				for(int k = j * j; k < isTrue.length; k += j) {
					isTrue[k] = true;
				}
			}
			for(int j = 0; j < isTrue.length; j++) {
				
				int copy_n = n;
				if(isTrue[j] == false) {
					copy_n -= j;
					if(isTrue[copy_n] == false) {
						System.out.println(j + " " + copy_n);
						break;
					}
				}
				//소수간의 차이가 최소가 되어야함..
			}
		}
		
	}

}
