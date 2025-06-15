package Lec45;

public class Print_SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		SubSequnce(s);
	}

	private static void SubSequnce(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			Print(s, i);
		}

	}

	private static void Print(String s, int i) {
		// TODO Auto-generated method stub
		int pos = 0;
		String ans = "";
		while (i > 0) {
			if ((i & 1) != 0) {
				ans += s.charAt(pos);
			}
			pos++;
			i >>= 1;
		}
		System.out.println(ans);
	}

}
