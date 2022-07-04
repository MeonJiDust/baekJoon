package basicMath02;

import java.util.Scanner;

public class Num2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		boolean first_min = true;
		int min = 0;
		
		for(int i = m; i <= n; i++) {
			
			boolean isTrue = true;
			
			if(i == 2) {
				sum += i;
				if(first_min == true) {
					min = i;
					first_min = false;
				}else {
					if(i < min) {
						min = i;
					}
				}
				continue;
			}else if(i % 2 == 0 || i == 1) {
				continue;
			}
			for(int j = 3; j < i; j++) {
				if(i % j == 0) {
					isTrue = false;
					break;
				}
			}
			if(isTrue == true) {
				sum += i;
				if(first_min == true) {
					min = i;
					first_min = false;
				}else {
					if(i < min) {
						min = i;
					}
				}
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
