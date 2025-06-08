package Lec43;

import java.util.Arrays;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length() + 1][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(s, t, 0, 0, dp));
	}

// s--> coin -->i
// t--> amount -->j	
	public static int Coin_Change(String coin, String amount, int i, int j, int[][] dp) {
		if (j == amount.length()) {
			return 1;
		}
		if (i == coin.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		if (coin.charAt(i) == amount.charAt(j)) {
			inc = Coin_Change(coin, amount, i + 1, j + 1, dp);
		}
		exc = Coin_Change(coin, amount, i + 1, j, dp);
		return dp[i][j] = inc + exc;
	}
}
