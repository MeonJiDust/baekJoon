package sort;

import java.util.Arrays;

public class Marge_sort {
	/*
	 * ���� ������ ���
	 * �� �̻��� �κ��������� ������, 
	 * �� �κ������� ������ ����,
	 * �κ� ���յ��� �ٽ� ���ĵ� ���·� ��ġ�� ���
	 * 
	 */

	public static int[] arr;
	public static int[] temp_arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arr = new int[]{5,3,4,7,1,2};
		temp_arr = new int[arr.length];
		
		System.out.println(Arrays.toString(arr));
		marge_sort(0, arr.length - 1);
	}

	private static void marge_sort(int start, int end) {
		// TODO Auto-generated method stub
		System.out.println("start: " + start + " end: " + end);
		if(start < end) {
			int mid = (start + end) / 2;
			
			System.out.println("! star: " + start + " mid: " + mid);
			marge_sort(start, mid);
			System.out.println(Arrays.toString(arr));
			System.out.println("here! start:" + start + " end: " + end + " arr: " + Arrays.toString(temp_arr));
			System.out.println("!! mid + 1: " + (mid+1) + " end: " + end);
			marge_sort(mid + 1, end);
			System.out.println("here!! start:" + start + " end: " + end + " arr: " + Arrays.toString(temp_arr));
			
			int p = start;
			int q = mid + 1;
			int idx = p; //���ο� �迭�� �ε���
			System.out.println("p:" + p + " q: " + q + " mid: " + mid + " idx: " + idx);
			
			while(p <= mid || q <= end) {
				if(q > end || (p <= mid && arr[p] <= arr[q])) {
					temp_arr[idx++] = arr[p++];
				}else {
					temp_arr[idx++] = arr[q++];
				}
			}
			
			for(int i = start; i < end; i++) {
				arr[i] = temp_arr[i];
			}
		}
	}

}
