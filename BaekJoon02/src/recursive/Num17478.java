package recursive;

import java.util.Scanner;
/*
 * ----�̰� ���� �ذ� �� ��...
 */

public class Num17478 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(catbot(n));
	}

	private static String catbot(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			System.out.println("����Լ��� ������?");
			System.out.println("����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����");
			return "��� �亯�Ͽ���.\n";
		}else {
			System.out.println("����Լ��� ������?");
			System.out.println("�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
			System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
			System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.");
		}
		
		return catbot(n - 1) + "��� �亯�Ͽ���.\n";
	}

}
