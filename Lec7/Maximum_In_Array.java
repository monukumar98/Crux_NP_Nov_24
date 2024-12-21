package Lec7;

public class Maximum_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		System.out.println(Maximum(arr));
		System.out.println(Maximum1(arr));
	}

	public static int Maximum1(int[] arr) {
		int max = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i], max);

		}
		return max;
	}

	public static int Maximum(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
