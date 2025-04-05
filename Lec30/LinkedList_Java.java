package Lec30;

import java.util.LinkedList;

public class LinkedList_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);// add last
		ll.add(20);// add last
		ll.add(15);// add last
		ll.add(127);// add last
		System.out.println(ll.get(1));
		System.out.println(ll);
		System.out.println(ll.remove(0));
		System.out.println(ll);

	}

}
