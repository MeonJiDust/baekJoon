package sort;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {38, 5, 44, 3, 47, 15, 36, 26, 27, 2};
		
		System.out.println(Arrays.toString(arr));
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j >= 1; j--) {
				
				if(arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
					System.out.printf("in if  - i: %d, j: %d, arr: %s\n", i, j, Arrays.toString(arr));
				}else {
					break;
				}
			}
			System.out.printf("out if - i: %d, arr: %s\n", i, Arrays.toString(arr));
		}
	}

}
