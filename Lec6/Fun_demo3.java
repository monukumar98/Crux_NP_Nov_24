package Lec6;

public class Fun_demo3 {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println("Hello");
		int a = 8;
		int b = 7;
		System.out.println(val);
		System.out.println(addition(a, b));
		System.out.println(val);// 75 ya 95 100
		System.out.println("bye");
	}

	public static int addition(int a, int b) {
		int c = a + b;
		int val = 80;
		Fun_demo3.val = Fun_demo3.val - 5;
		return c;

	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
