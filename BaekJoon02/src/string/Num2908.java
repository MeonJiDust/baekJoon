package string;

import java.util.Scanner;

public class Num2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int f_num = sc.nextInt();
		int s_num = sc.nextInt();
		
		String f_str = Integer.toString(f_num);
		String s_str = Integer.toString(s_num);
		
		System.out.println("1. f_str: " + f_str + " s_str: " + s_str);
		
		int temp_f = temp(f_str);
		int temp_s = temp(s_str);
		System.out.println("2. f_str: " + temp_f + " s_str: " + temp_s);
		
		if(temp_f > temp_s) {
			System.out.println(temp_f);
		}else {
			System.out.println(temp_s);
		}
	}
	public static int temp(String str) {
		
		String temp_str = "";
		
		char f = str.charAt(0);
		System.out.println(f);
		char s = str.charAt(1);
		System.out.println(s);
		char t = str.charAt(2);
		System.out.println(t);
		
		temp_str += Character.toString(t);
		System.out.println("3. temp_str: " + temp_str);
		temp_str += Character.toString(s);
		System.out.println("3. temp_str: " + temp_str);
		temp_str += Character.toString(f);
		System.out.println("3. temp_str: " + temp_str);
		
		int temp_num = Integer.parseInt(temp_str);
		System.out.println("3. temp_str: " + temp_str);
		
		return temp_num;
		
	}

}
