package Lec7;

public class Sum_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		System.out.println(Sum_Array(arr));
	}

	public static int Sum_Array(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];// sum = sum + arr[i];

		}
		return sum;
	}
}
