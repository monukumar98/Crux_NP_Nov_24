package Lec26;

import java.util.Stack;

public class Baseball_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("+")) {
				int a = st.pop();
				int b = st.peek();
				st.push(a);
				st.push(a + b);

			} else if (arr[i].equals("C")) {
				st.pop();
			} else if (arr[i].equals("D")) {
				int x = st.peek();
				st.push(2 * x);
			} else {
				int num = Integer.parseInt(arr[i]);
				st.push(num);
			}
		}
		int sum = 0;
		for (int val : st) {
			sum += val;
		}
		System.out.println(sum);
	}

}
