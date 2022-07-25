package sort;

import java.util.Arrays;

public class Merge_sort {
	/*
	 * 분할 정복법 사용
	 * 둘 이상의 부분집합으로 가르고, 
	 * 각 부분집합을 정렬한 다음,
	 * 부분 집합들을 다시 정렬된 형태로 합치는 방식
	 * 
	 */

	public static int[] arr;
	public static int[] temp_arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arr = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
		temp_arr = new int[arr.length];
		
		System.out.println(Arrays.toString(arr));
		merge_sort(0, arr.length - 1);
	}

	private static void merge_sort(int start, int end) {
		// TODO Auto-generated method stub
		
		if(start < end) {
			int mid = (start + end) / 2;
			
			merge_sort(start, mid);
			merge_sort(mid + 1, end);
			
			
		}
	}

}
