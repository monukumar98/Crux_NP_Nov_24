package Lec45;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		System.out.println(Nthmagic(n));
	}

	public static int Nthmagic(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans += mul;
			}
			n >>= 1;
			mul = mul * 5;

		}
		return ans;
	}

}
