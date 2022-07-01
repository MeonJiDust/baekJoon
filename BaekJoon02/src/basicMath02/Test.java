package basicMath02;

import java.util.Scanner;

/*
 * 멘토링
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
//		double x = 0.2;
//		
//		System.out.print("정수 입력: ");
//		int y = sc.nextInt();
//		
//		System.out.println("입력받은 값: " + y);
//		
//		int sum = (int)x + y;
//		
//		System.out.printf("%d", x);
//		
//		char c = 'd';
//		System.out.println(c);
//		System.out.printf("%c", c);
//		
//		String str = sc.next();
//		
//		System.out.println(str);
//		
//
//		//if문!
//		int a = 10;
//		int b = 11;
//		
//		if(a > b) {
//			System.out.println("a가 더 큼!");
//		}else if(b > a) {
//			System.out.println("b가 더 큼!");
//		}else {
//			System.out.println("같음");
//		}
//		
//		String str1 = "Hello";
//		String str2 = "Hello";
//		
//		if(str1.equals(str2)) {
//			System.out.println("같음");
//		}else {
//			System.out.println("다름");
//		}
//		
//		//반복문!
//		
//		//for(초기식; 조건식; 증감식){
//		//	실행문;
//		//}
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.printf("i: %d\n", i);
//		}
//		
//		//while문
//		
//		//while(조건식){
//		//	실행문;
//		//}
//		
//		int k = 0;
//		
//		while(k < 10) {
//			
//			System.out.printf("k: %d\n", k);
//			k++;
//		}
		
//		while(true) { // if break;
//			
//			k++;
//			
//			if(k > 10) {
//				break;
//			}
//			
//			System.out.println(k);
////		}
//		while(true) {
//			int n = sc.nextInt();
//			if(n == 0) {
//				break;
//			}
//			System.out.println(n);
//		}
		
//		while(true) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int sum = a + b;
//			
//			if(a == 0 && b == 0) {
//				break;
//			}
//			System.out.println(sum);
//		}
		
		//배열
		
		// int char double...
//		int x = 10;
//		int y = 10;
//		int z = 10;
//		int ye = 11;
//		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = 0;
			System.out.printf("arr[%d] = %d\n",i, arr[i]);
		}
	}

}
