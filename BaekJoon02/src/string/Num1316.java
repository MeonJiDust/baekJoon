package string;

import java.util.Scanner;

public class Num1316 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test_case = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < test_case; i++) {
			
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean check() {
		
		boolean[] arr = new boolean[26];
		String str = sc.next();
		int prov = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			int current_int = str.charAt(i);
			
			if(prov != current_int) {
				
				if(arr[current_int - 'a'] == false) {
					arr[current_int - 'a'] = true;
					prov = current_int;
				}else {
					return false;
				}
			}else {
				continue;
			}
		}
		return true;
	}

}
