package recursive;

import java.util.Scanner;
/*
 * ----�̰� ���� �ذ� �� ��...
 */

public class Num17478 {

	static int firstN;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		firstN = sc.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		System.out.println(catbot(firstN));
	}

	private static String catbot(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			System.out.print(format(n));
			System.out.println("\"����Լ��� ������?\"");
			System.out.print(format(n));
			System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.print(format(n));
			return "��� �亯�Ͽ���.\n";
		}else {
			System.out.print(format(n));
			System.out.println("\"����Լ��� ������?\"");
			System.out.print(format(n));
			System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			System.out.print(format(n));
			System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			System.out.print(format(n));
			System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		}
		
		return catbot(n - 1) + format(n) + "��� �亯�Ͽ���.\n";
	}
	private static String format(int n) {
		
		String formatStr = "";
		for(int i = firstN; i > n; i--) {
			formatStr += "____";
		}
		return formatStr;
	}

}
