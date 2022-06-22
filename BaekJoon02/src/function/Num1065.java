package function;

import java.util.Scanner;

public class Num1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			int current_num = i;
			int l_num = current_num % 10;
			current_num /= 10;
			int f_num = current_num / 10;
			int m_num = current_num % 10;
			
			if(i <= 99) count++;
			else if((f_num - m_num) == (m_num - l_num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
