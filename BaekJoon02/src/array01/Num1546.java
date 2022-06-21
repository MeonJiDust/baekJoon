package array01;

import java.util.Arrays;
import java.util.Scanner;

public class Num1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		int max;
		double sum = 0.0;
		double avg;
		double[] new_arr = new double[num];
		
		for(int i = 0; i < num; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		max = arr[num - 1];
		System.out.println(max);
		
		for(int i = 0; i < num; i++) {
			
			new_arr[i] = (double)arr[i] / max * 100;
			sum += new_arr[i];
			System.out.println(sum);
		}
		
		avg = sum / num;
		
		System.out.println(avg);
	}

}
