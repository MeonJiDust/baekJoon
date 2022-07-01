package basicMath02;

import java.util.Scanner;

public class Num1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		int[] arr = new int[test_case];
		int count = 0;
		
		for(int i = 0; i < test_case; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < test_case; i++) {
			
			boolean isPrime = true;
			
			if(arr[i] == 2) {
				count++;
				continue;
			}else if(arr[i] % 2 == 0 || arr[i] == 1) {
				isPrime = false;
				continue;
			}
			for(int j = 3; j < arr[i]; j++) {
				
				if(arr[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				count++;
			}
		}
		System.out.println(count);
	}

}
