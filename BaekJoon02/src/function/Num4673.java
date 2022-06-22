package function;

public class Num4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10001];
		
		for(int i = 0; i < 10001; i++) {
			
			int result_num = func(i);
			if(result_num <= 10000) {
				
				arr[result_num]++;
			}
			
		}
		
		for(int i = 0; i < 10001; i++) {
			
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
		
	}

	public static int func(int num) {
		
		int result_num = num;
		int test_num = num;
		
		while(true) {
			
			if(test_num != 0) {
				
				result_num += (test_num % 10);
				test_num = test_num / 10;
			}else {
				break;
			}
		}
		return result_num;
	}
}
