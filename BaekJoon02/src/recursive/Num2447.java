package recursive;

import java.util.Scanner;
/*
 * �̰� �� �����.. ��� �����... ���� ���� ������ �㿡 �ٽ� Ǯ���
 */

public class Num2447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(star(n, "*"));
	}

	private static String star(int n, String strN) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return "end";
		}
		String star = "";
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 || i == (n - 1)) {
					star += strN;
					System.out.print(strN);
				}else if(j == 0 || j == (n - 1)) {
					star += strN;
					System.out.print(strN);
				}else {
					star += " ";
					System.out.print(" ");
				}
			}
			star += "\n";
			System.out.println();
		}
		return star(n - 1, star);
	}

}
