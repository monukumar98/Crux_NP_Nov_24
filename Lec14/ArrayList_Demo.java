package Lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(1);
		ll.add(1);
		ll.add(15);
		ll.add(-9);
		System.out.println(ll);
		ll.add(1, 11);// 1st index pe add krega O(N)
		System.out.println(ll.size());
		System.out.println(ll);
		// get
		System.out.println(ll.get(2));// O(1)
		// reomove
		System.out.println(ll.remove(1));// O(N)
		System.out.println(ll);
		//update
		ll.set(1, -20);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
	}

}










