package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Num1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
//		
//		//�츮�� ������ �����ڷ� ���ڿ��� �ɰ��ִ� Ŭ���� 
//		str.trim(); // �յ� ���� ����
//		
//		String[] str_arr = str.split("\\s");
//		
//		int length = str_arr.length;
//		
//		System.out.println(length);
		System.out.println(st.countTokens());
		
	}

}
