package Lec25;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.size());
		System.out.println(st.capacity());
		// add
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st);
		for (int v : st) {
			System.out.print(v + " ");
		}

	}

}
