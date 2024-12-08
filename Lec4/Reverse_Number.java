package Lec4;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2345;
		int res = 0;
		while (n > 0) {
			int rem = n % 10;
			res = res * 10 + rem;
			n = n / 10;
		}
		System.out.println(res);
	}

}
