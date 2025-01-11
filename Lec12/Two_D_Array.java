package Lec12;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		System.out.println(arr);// 2d Array
		System.out.println(arr[1]);// 1d Array
		System.out.println(arr[1][0]);// 0

		int[][] other = arr;
		int row = arr.length;
		int col = arr[0].length;
	}

}
