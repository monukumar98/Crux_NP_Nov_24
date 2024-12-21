package Lec7;

public class Array_Swap_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 2, 1, 4 };
//		int[] brr = new int []{ 5, 3, 2, 1, 4 };
		System.out.println(arr[0] + " " + arr[1]);// 5 3
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);// ??
	}

	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
