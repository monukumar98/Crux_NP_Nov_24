package Lec45;

public class Set_UnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 3;
		if (Set_Unset_Bit(n, i)) {
			System.out.println("Set");
		} else {
			System.out.println("UnSet");
		}

	}

	public static boolean Set_Unset_Bit(int n, int i) {
		int mask = (1 << i);
		if ((n & mask) == 0) {
			return false;
		}

		return true;

	}
}
