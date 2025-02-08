package Lec18;

import java.util.ArrayList;
import java.util.List;

public class Key_Paid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		List<String> ll = new ArrayList<>();
		KeyPaid(ques, "",ll);
	}

	public static void KeyPaid(String ques, String ans,List<String> ll) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String s = key[ch - '0'];// abc
		for (int i = 0; i < s.length(); i++) {
			KeyPaid(ques.substring(1), ans + s.charAt(i),ll);
		}

	}
}
