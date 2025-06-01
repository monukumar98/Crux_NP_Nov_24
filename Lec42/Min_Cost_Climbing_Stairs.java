package Lec42;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int zero = Min_Cost(cost, 0);
		int one = Min_Cost(cost, 1);
		System.out.println(Math.min(zero, one));

	}

	public static int Min_Cost(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int setp1 = Min_Cost(arr, i + 1);
		int setp2 = Min_Cost(arr, i + 2);
		return Math.min(setp1, setp2) + arr[i];

	}

}
