package Lec28;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1, 9));
		System.out.println(add(1, 9, 9));
		System.out.println(add(1, 9, 9.8));
		System.out.println(add(2, 3, 4, 2, 33, 1, 1, 21, 1, 22, 1, 1, 1, 43, 9));

	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int x,int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, double c) {
		return (int) (a + b + c);
	}
	public static int add(int a, double b, int c) {
		return (int) (a + b + c);
	}
}
