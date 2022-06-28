package repeat;

import java.util.Scanner;

public class Num1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int first_num = sc.nextInt();
		int new_num = first_num;
		int sum_num = 0;
		int count = 0;
		
		do {
			sum_num = new_num / 10 + new_num % 10;
			new_num = (new_num % 10) * 10 + sum_num % 10;
			count++;
		}while(new_num != first_num);
		
		System.out.println(count);
	}

}
