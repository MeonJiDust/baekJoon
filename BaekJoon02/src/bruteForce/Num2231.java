package bruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Num2231 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int num = Integer.parseInt(st.nextToken());
		
		int result = decomposition(num);
		System.out.println(result);
		
		
	}

	private static int decomposition(int num) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= num; i++) {
			
			int format = i;
			int sum = format;
			while(format > 0) {
				
				sum += (format % 10);
				format /= 10;
			}
			if(sum == num) {
				return i;
			}
		}
		return 0;
	}

}
