package basicMath01;

import java.util.Scanner;

public class Num1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int top = 0, under = 0;
		int i = 0;
		int current = 0;
		boolean isTrue = false;
		
		while(true) {
			if(i % 2 == 1) {
				for(int j = 0; j < i; j++) {
					
					top = i - j;
					under = j + 1;
					current++;
					
					if(current == num) {
						isTrue = true;
						break;
					}
				}
			}else {
				
				for(int j = 0; j < i; j++) {
					
					top = j + 1;
					under = i - j;
					current++;
					
					if(current == num) {
						isTrue = true;
						break;
					}
				}
			}
			i++;
			if(isTrue == true) {
				break;
			}
		}
		
		System.out.println(top + "/" + under);
		
	}

}
