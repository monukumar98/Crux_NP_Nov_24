package Lec26;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);
	}

	public static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			return;
		}
		int x = st.pop();
		Reverse(st);
		add_Last(st, x);

	}

	public static void add_Last(Stack<Integer> st, int item) {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		add_Last(st, item);
		st.push(x);

	}
}
