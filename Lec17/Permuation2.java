package Lec17;

public class Permuation2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abca";
		Print(ques, "");

	}

	public static void Print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (IsPresent(ques, ch, i) == false) {
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				Print(s1 + s2, ans + ch);
			}
		}

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
