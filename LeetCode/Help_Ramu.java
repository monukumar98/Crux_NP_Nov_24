package LeetCode;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();// number of rickshaws
			int m = sc.nextInt();// number of cab
			int[] ride_rickshaw = new int[n];
			int[] ride_cab = new int[m];

			for (int i = 0; i < ride_rickshaw.length; i++) {
				ride_rickshaw[i] = sc.nextInt();
			}  
			for (int i = 0; i < ride_cab.length; i++) {
				ride_cab[i] = sc.nextInt();
			}
			System.out.println(MiniAmount(c1, c2, c3, c4, ride_rickshaw, ride_cab));

		}
	}

	public static int MiniAmount(int c1, int c2, int c3, int c4, int[] ride_rickshaw, int[] ride_cab) {
		int cost_rickshaw = 0;
		for (int i = 0; i < ride_rickshaw.length; i++) {
			cost_rickshaw += Math.min(ride_rickshaw[i] * c1, c2);
		}
		cost_rickshaw = Math.min(cost_rickshaw, c3);
		int cost_cab = 0;
		for (int i = 0; i < ride_cab.length; i++) {
			cost_cab += Math.min(ride_cab[i] * c1, c2);
		}
		cost_cab = Math.min(cost_cab, c3);

		return Math.min(cost_rickshaw + cost_cab, c4);
	}

}
