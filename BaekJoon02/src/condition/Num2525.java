package condition;

import java.util.Scanner;

public class Num2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cook_time = sc.nextInt();
		
		int final_hour = 0;
		int final_minute = 0;
		
		final_minute = minute + cook_time;
		final_hour = hour;
		if(final_minute >= 60) {
			
			final_minute = final_minute % 60;
			final_hour += (minute + cook_time) / 60;
			System.out.println("test: " + final_hour + " " + final_minute);
			if(final_hour >= 24) {
				System.out.println("µé¾î¿È?");
				final_hour = final_hour % 24;
			}
		}
		System.out.println(final_hour + " " + final_minute);
	}

}
