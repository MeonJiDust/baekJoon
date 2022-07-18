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
		int[] arr = new int[n];
		boolean isTrue = false;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					
					if(list.contains(arr[i] + arr[j] + arr[k])) {
						continue;
					}else {
						list.add(arr[i] + arr[j] + arr[k]);
					}
					
				}
			}
		}
		int[] list_arr = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			list_arr[i] = list.get(i);
		}
		Arrays.sort(list_arr);
		int max = list_arr[0];
		
		for(int i = 0; i < list_arr.length; i++) {
			if(max > m) {
				break;
			}else {
				max = list_arr[i];
			}
		}
		System.out.println(max);
	}

}
