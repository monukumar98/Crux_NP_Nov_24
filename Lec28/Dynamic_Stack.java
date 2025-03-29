package Lec28;

import Lec25.Stack;

public class Dynamic_Stack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] new_Array = new int[2 * arr.length];
			for (int i = 0; i < arr.length; i++) {
				new_Array[i] = arr[i];
			}
			arr = new_Array;
		}
		super.push(item);
	}

	public static void main(String[] args) throws Exception {
		Dynamic_Stack st = new Dynamic_Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.Display();
	}

}





