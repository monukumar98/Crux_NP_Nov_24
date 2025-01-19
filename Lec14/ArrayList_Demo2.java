package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo2 {
	public static void main(String[] args) {
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(1);
		ll.add(1);
		ll.add(15);
		ll.add(-9);
		ll.add(11);
		ll.add(151);
		ll.add(-91);
		ll.add(78);
		ll.add(7);
		System.out.println(ll);
		System.out.println(ll.size());
//		for (int i = 0; i < ll.size(); i++) {
//			System.out.print(ll.get(i) + " ");
//		}
//		System.out.println();
//		int[] arr = new int[6];
//		for (int x : arr) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//		for (int x : ll) {
//			System.out.print(x + " ");
//		}
	}
}
