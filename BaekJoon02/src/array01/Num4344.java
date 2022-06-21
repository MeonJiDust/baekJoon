package array01;

import java.util.Scanner;

public class Num4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double[] arr_result = new double[num];
		int[] arr_inside;
		int sum = 0;
		double avg = 0.0;
		int stu_sum = 0;
		
		for(int i = 0; i < num; i++) {
			
			
			int student = sc.nextInt();
			arr_inside = new int[student];
			
			for(int j = 0; j < student; j++) {
				arr_inside[j] = sc.nextInt();
				sum += arr_inside[j];
			}
			avg = sum / student;
			
			for(int j = 0; j < student; j++) {
				
				if(arr_inside[j] > avg) {
					stu_sum++;
				}
			}
			
			arr_result[i] = stu_sum / (double)student * 100;
			sum = 0;
			stu_sum = 0;
			avg = 0.0;
		}
		
		for(int i = 0; i < num; i++) {
			
			System.out.printf("%.3f%%\n", arr_result[i]);
		}
		
	}

}
