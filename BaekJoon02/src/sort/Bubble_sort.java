package sort;

import java.util.Arrays;
/*
 * ������ ���� �� ���� �� ������ ������ ���̶� �� �̰����Ϳ� ���� �ٸ�����.
 * �׷��� �ð����⵵�� O(N��)
 */

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {36, 5,44,33,65,2,45,63,8,3,10};
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.printf("i: %d, arr: %s\n", i, Arrays.toString(arr));
		}
	}

}
