package Lec6;

public class Fun_demo2 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int a = 8;
		int b = 7;
		System.out.println(addition(a, b));
//		int x=addition(a, b);
//		System.out.println(x);
		System.out.println("bye");
	}

	public static int addition(int a, int b) {
		int c = a + b;
		return c + sub(c, a);

	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c - fun(b, c);

	}

	public static int fun(int a, int b) {
		int c = (a - b) * 3;
		return c;

	}
}




