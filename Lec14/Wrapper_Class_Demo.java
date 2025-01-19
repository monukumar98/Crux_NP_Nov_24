package Lec14;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 7;
		System.out.println(a);
		System.out.println(a1);
		long l = 9;
		Long l1 = 19l;
		int b = 11;

		// auto-Boxing
		Integer x = b;

		// Unboxing
		int c = x;
		Integer c1 = 90;
		Integer c2 = 90;
		Integer c3 = 190;
		Integer c4 = 190;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);

	}

}














