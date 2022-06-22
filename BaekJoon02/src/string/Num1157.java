package string;

import java.util.Scanner;

public class Num1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] arr = new int[26];
		char print_str = 0;
		int current = 0;
		
		for(int i = 0; i < 26; i++) {
			arr[i] = 0;
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			char char_str = str.charAt(i);
			
			if((int)char_str >= 97) {
				current = char_str - 'a';
			}else if((int)char_str >= 65 && (int)char_str <= 90) {
				current = char_str - 'A';
			}
			
			arr[current]++;
			current = 0;
		}
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < 26; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
				
			}else if(arr[i] == max) ch = '?';
		}
		
		System.out.println(ch);
		
	}

}
