package Lec43;

import java.util.Arrays;

public class Knapsack_Zero_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 4;
		int[] wt = { 1, 2, 3, 2, 4 };
		int[] val = { 8, 4, 0, 5, 3 };
		int[][] dp = new int[cap + 1][wt.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Knapsack(wt, val, cap, 0, dp));

	}

	public static int Knapsack(int[] wt, int[] val, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		if(dp[cap][i]!=-1) {
			return dp[cap][i];
		}

		int inc = 0, exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + Knapsack(wt, val, cap - wt[i], i + 1, dp);
		}
		exc = Knapsack(wt, val, cap, i + 1, dp);
		return dp[cap][i] = Math.max(inc, exc);

	}

}
