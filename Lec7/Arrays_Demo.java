package Lec7;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int[] arr = new int[5];
//		int arr[] = new int[5];//C type
		System.out.println(arr);
		// set
		arr[0] = 9;
		arr[1] = -2;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 1;
		// get or print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr.length);
		int[] other = arr;

	}

}
