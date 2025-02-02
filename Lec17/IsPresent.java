package Lec17;

public class IsPresent {
	public static void main(String[] args) {
		String s = "ababcdeaacc";
		char ch = 'a';
		int i = 3;
		System.out.println(IsPresent(s, ch, i));

	}

	public static boolean IsPresent(String s, char ch, int i) {

		for (int k = i + 1; k < s.length(); k++) {
			if (s.charAt(k) == ch) {
				return true;
			}
		}
		return false;

	}
}
