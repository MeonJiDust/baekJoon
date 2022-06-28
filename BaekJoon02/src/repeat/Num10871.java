package repeat;

import java.util.Scanner;

public class Num10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
