package basicMath01;

import java.util.Scanner;

public class Num1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c <= b) {
			System.out.println(-1);
		}else {
			System.out.println(a / (c - b) + 1); 
			// 1���� ������ ������ �߻��ϴ� ������ ã�ƾ��ϱ� ������
		}
	}

}
