package recursive;

import java.util.Scanner;

public class Num11729 {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//System.out.println((int) (Math.pow(2, n)) - 1);
		sb.append((int) ((Math.pow(2, n)) - 1)).append("\n");
		
		hanoi(n, 1, 2, 3);
		System.out.println(sb);
		
	}

	private static void hanoi(int n, int start, int mid, int to) {
		// TODO Auto-generated method stub
		
		if(n == 1) {
			//System.out.println(start + " " + to);
			sb.append(start + " " + to + "\n");
			return;
		}
		
		hanoi(n - 1, start, to, mid);
		
		//System.out.println(start + " " + to);
		sb.append(start + " " + to + "\n");
		
		hanoi(n - 1, mid, start, to);
	}

}
