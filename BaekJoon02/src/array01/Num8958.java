package array01;

import java.util.Scanner;

public class Num8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int total_sum = 0;
		int recent_sum = 1;
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		int[] arr_result = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					total_sum += recent_sum;
					recent_sum++;
				}else if(arr[i].charAt(j) == 'X') {
					recent_sum = 1;
				}
				
			}
			arr_result[i] = total_sum;
			total_sum = 0;
			recent_sum = 1;

		}
		
		for(int i = 0; i < num; i++) {
			
			System.out.println(arr_result[i]);
		}
	}

}
