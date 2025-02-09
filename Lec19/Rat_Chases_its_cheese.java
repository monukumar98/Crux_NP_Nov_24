package Lec19;

import java.util.Scanner;

public class Rat_Chases_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		Print(maze, 0, 0, ans);
		if (v == false) {
			System.out.println("NO PATH FOUND");
		}
	}

	static boolean v = false;

	public static void Print(char[][] maze, int cr, int cc, int[][] ans) {
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			v = true;
			ans[cr][cc] = 1;
			Display(ans);
			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, -1, 0, 1 };
		for (int i = 0; i < c.length; i++) {
			Print(maze, cr + r[i], cc + c[i], ans);
		}
//		Print(maze, cr - 1, cc, ans);
//		Print(maze, cr, cc - 1, ans);
//		Print(maze, cr + 1, cc, ans);
//		Print(maze, cr, cc + 1, ans);
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
