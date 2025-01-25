package Lec16;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;// no of row
		int m = 3;// no of col
		Print_Path(0, 0, n - 1, m - 1, "");

	}

	// cr--> current row
	// cc-->current col
	// er--> end row
	// ec--> end col
	public static void Print_Path(int cr, int cc, int er, int ec, String ans) {
		if (cc == ec && cr == er) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		Print_Path(cr, cc + 1, er, ec, ans + "H");
		Print_Path(cr + 1, cc, er, ec, ans + "V");

	}

}
