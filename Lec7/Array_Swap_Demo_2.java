package Lec7;

public class Array_Swap_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 2, 1, 4 };
		System.out.println(arr[0] + " " + arr[1]);// 5 3
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);// 3 5
	}

	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
