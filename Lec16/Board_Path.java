package Lec16;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		Print(0, n, "");

	}

	public static void Print(int curr, int n, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return;
		}
		if (curr > n) {
			return;
		}

		for (int dice = 1; dice <= 3; dice++) {
			Print(curr + dice, n, ans + dice);
		}
//		Print(curr + 1, n, ans + 1);
//		Print(curr + 2, n, ans + 2);
//		Print(curr + 3, n, ans + 3);

	}
}
