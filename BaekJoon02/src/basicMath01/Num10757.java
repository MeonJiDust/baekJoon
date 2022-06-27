package basicMath01;

import java.math.BigInteger;
import java.util.Scanner;

public class Num10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		BigInteger a_big = new BigInteger(a);
		BigInteger b_b_big = new BigInteger(b);
		
		System.out.println(a_big.add(b_b_big));
	}

}
