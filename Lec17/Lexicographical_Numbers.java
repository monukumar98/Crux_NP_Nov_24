package Lec17;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		List<Integer> ll = new ArrayList<>();
		Lexicographical(0, n, ll);
		System.out.println(ll);

	}

	public static void Lexicographical(int curr, int n, List<Integer> ll) {
		if (curr > n) {
			return;
		}
		// System.out.println(curr);
		if (curr != 0) {
			ll.add(curr);
		}
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Lexicographical(curr * 10 + i, n, ll);
		}

	}
}
