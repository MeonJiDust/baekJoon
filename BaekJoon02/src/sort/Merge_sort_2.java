package sort;

public class Merge_sort_2 {

	private static int[] sorted;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public static void merge_sort(int[] a) {
		
		sorted = new int[a.length];
		merge_sort(a, 0, a.length - 1);
		sorted = null;
	}

	private static void merge_sort(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		 
		/*
		 * left == right -> 부분 리스트가 1개의 원소만 갖고 있는 경우
		 * 더이상 쪼갤 수 없으므로 return
		 */
		if(left == right) return;
		
		int mid = (left + right) / 2;
		
		merge_sort(a, left, mid); // 절반 중 왼쪽 부분 리스트 (left ~ mid)
		merge_sort(a, mid + 1, right); // 절반 중 오른쪽 부분 리스트 (mid + 1 ~ right)
		
		merge(a, left, mid, right); // 병합 작업
	}
	
	private static void merge(int[] a, int left, int mid, int right) {
		
		int p = left; // 왼쪽 부분리스트의 시작점
		int q = mid + 1; // 오른쪽 부분리스트의 시작점
		int idx = left; // 채워 넣을 배열의 인덱스
		
		while(p <= mid && q <= right) {
			
			/*
			 * 왼쪽 부분리스트 p번째 원소가 오른쪽 부분리스트 q번째 원소보다 작거나 같을 경우
			 */
			if(a[p] <= a[q]) {
				sorted[idx++] = a[p++];
			}else {
				sorted[idx++] = a[q++];
			}
		}
	}
	
	

}
