package bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1018 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[n];
		int black = 0;
		int white = 0;
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = br.readLine();
			
			for(int j = 0; j < m; j++) {
				 
				if(arr[i].charAt(j) == 'B') {
					black++;
				}else {
					white++;
				}
			}
		}
		
		if(black < 32) {
			count += (32 - black);
		}
		if(white < 32) {
			count += (32 - white);
		}
		
		System.out.println(count);
	}

}
