package Lec34;

public interface StackI {
	public static final int x = 9;// never

	public void push(int item);

	public int pop();

	public int peek();

	// java 8
	static void fun() {

	}

	default void fun1() {

	}

	// java 9
	private static void fun3() {

	}

	private void fun4() {

	}

}





