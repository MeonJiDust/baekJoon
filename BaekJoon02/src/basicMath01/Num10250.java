package basicMath01;

import java.util.Scanner;

public class Num10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for(int i = 0; i < test_case; i++) {
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			int num = sc.nextInt();
			int fav_h = 0, fav_w = 1;
			
			for(int j = 0; j < num; j++) {
				
				if(fav_h < h) {
					fav_h++;
				}else {
					fav_h = 1;
					fav_w++;
				}
			}
			String Sfav_h = Integer.toString(fav_h);
			String Sfav_w = Integer.toString(fav_w);
			if(fav_w < 10) {
				Sfav_w = "0" + Sfav_w;
			}
			String final_string = Sfav_h + Sfav_w;
			System.out.println(final_string);
		}
	}

}
