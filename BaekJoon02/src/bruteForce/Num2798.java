package bruteForce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num2798 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];//
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int result = blackJack(arr, n, m);
		System.out.println(result);
		
	}

	private static int blackJack(int[] arr, int n, int m) {
		// TODO Auto-generated method stub
		int result = 0;
		
		for(int i = 0; i <= arr.length - 3; i++) {
			for(int j = i + 1; j <= arr.length - 2; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					
					int temp = arr[i] + arr[j] + arr[k];
					
					if(temp == m) {
						return temp;
					}
					
					if(result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}
		return result;
	}

}
