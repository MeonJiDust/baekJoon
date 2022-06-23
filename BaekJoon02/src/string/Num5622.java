package string;

import java.util.Scanner;

public class Num5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int total_time = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char current_char = str.charAt(i);
			
			switch(current_char) {
			
			case 'A': case 'B': case 'C':
				total_time += 3;
				break;
			case 'D': case 'E': case 'F':
				total_time += 4;
				break;
			case 'H': case 'I': case 'G':
				total_time += 5;
				break;
			case 'J': case 'K': case 'L':
				total_time += 6;
				break;
			case 'M': case 'N': case 'O':
				total_time += 7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				total_time += 8;
				break;
			case 'T': case 'U': case 'V':
				total_time += 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				total_time += 10;
				break;
			default:
				break;
			}
		}
		System.out.println(total_time);
	}

}
