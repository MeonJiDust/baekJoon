package string;

import java.util.Scanner;

public class Num2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char current = str.charAt(i);
			
			if(current == 'c' || current == 's' || current == 'z') {
				if(i < str.length() - 1){
					if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}else if(current == 'd') {
				if(i < str.length() - 1){
					if(str.charAt(i + 1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					}else if(str.charAt(i + 1) == '-'){
						i++;
					}
				}
			}else if(current == 'l' || current == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
			count++;
		}
		
		System.out.println(count);
	}

}
