package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num7568 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		int[][] arr = new int[test_case][2];
		int[] grade_arr = new int[test_case];
		
		String[] str;
		for(int i = 0; i < test_case; i++) {
				
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		
		for(int i = 0; i < test_case; i++) {
			int grade = 1;
			for(int j = 0; j < test_case; j++) {
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
//					System.out.println("ÇöÀç i: " + i);
//					System.out.printf("%d : %d (kg) %d : %d (cm)\n", arr[i][0], arr[j][0], arr[i][1], arr[j][1]);
					grade++;
//					System.out.println("grade: " + grade);
				}
			}
			grade_arr[i] = grade;
		}
		
		for(int i = 0; i < test_case; i++) {
			System.out.println(grade_arr[i]);
		}
		
		
	}

}
