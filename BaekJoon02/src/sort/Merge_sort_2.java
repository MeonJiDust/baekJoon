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
		 * left == right -> �κ� ����Ʈ�� 1���� ���Ҹ� ���� �ִ� ���
		 * ���̻� �ɰ� �� �����Ƿ� return
		 */
		if(left == right) return;
		
		int mid = (left + right) / 2;
		
		merge_sort(a, left, mid); // ���� �� ���� �κ� ����Ʈ (left ~ mid)
		merge_sort(a, mid + 1, right); // ���� �� ������ �κ� ����Ʈ (mid + 1 ~ right)
		
		merge(a, left, mid, right); // ���� �۾�
	}
	
	private static void merge(int[] a, int left, int mid, int right) {
		
		int p = left; // ���� �κи���Ʈ�� ������
		int q = mid + 1; // ������ �κи���Ʈ�� ������
		int idx = left; // ä�� ���� �迭�� �ε���
		
		while(p <= mid && q <= right) {
			
			/*
			 * ���� �κи���Ʈ p��° ���Ұ� ������ �κи���Ʈ q��° ���Һ��� �۰ų� ���� ���
			 * ������ 1���� ���Ҹ� �� �迭�� �ְ� p�� idx�� 1������Ų��.
			 */
			if(a[p] <= a[q]) {
				sorted[idx++] = a[p++];
			}
			/*
			 * ������ �κи���Ʈ q��° ���Ұ� ���� �κи���Ʈ p��° ���Һ��� �۰ų� ���� ���
			 * �������� q��° ���Ҹ� �� �迭�� �ְ� q�� idx�� 1 ������Ų��.
			 */
			else {
				sorted[idx++] = a[q++];
			}
			
		}

		/*
		 * ���� �κи���Ʈ�� ���� ��� �� �迭�� ä������ ��� (p > mid)
		 *  == ������ �κи���Ʈ ���Ұ� ���� �������� ���
		 * ������ �κи���Ʈ�� ������ ���ҵ��� �� �迭�� ä���ش�.
		 */
		if(p > mid) {
			while(q <= right) {
				sorted[idx++] = a[q++];
			}
		}
		
		/*
		 * ������ �κи���Ʈ�� ���� ��� �� �迭�� ä������ ��� (q > right)
		 *  == ���� �κи���Ʈ ���Ұ� ���� �������� ���
		 * ���� �κи���Ʈ�� ������ ���ҵ��� �� �迭�� ä���ش�.
		 */
		else {
			while(p <= mid) {
				sorted[idx++] = a[p++];
			}
		}
		/*
		 * ���ĵ� �� �迭�� ������ �迭�� �����Ͽ� �Ű��ش�.
		 */
		
		for(int i = left; i <= right; i++) {
			a[i] = sorted[i];
		}
	}
	
	

}
