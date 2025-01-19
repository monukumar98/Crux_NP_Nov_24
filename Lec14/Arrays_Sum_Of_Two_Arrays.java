package Lec14;

import java.util.ArrayList;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 0, 2, 9 };
		int[] arr2 = { 3, 4, 5, 6, 7 };
		Sum_Of_Two_Arrays(arr1, arr2);

	}

	public static void Sum_Of_Two_Arrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;

		}
		while (i >= 0) {
			int sum = arr1[i] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			i--;

		}
		while (j >= 0) {
			int sum = arr2[j] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry != 0) {
			ll.add(carry);
		}
		for (int k = ll.size() - 1; k >= 0; k--) {
			System.out.print(ll.get(k) + ", ");
		}
		System.out.println("END");

	}

}
