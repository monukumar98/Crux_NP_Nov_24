package Lec14;

public class Cb_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		Count_CB_Number(s);
	}

	public static void Count_CB_Number(String s) {
		int count=0;
		boolean [] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				long num = Long.parseLong(s.substring(i, j));
				if(iscbnumber(num)&& IsVaild(visited,i,j-1)) {
					count++;
					for (int k = i; k <=j-1; k++) {
						visited[i]=true;
					}
				}
			}
		}
		System.out.println(count);
	}

	public static boolean IsVaild(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = i; k <=j; k++) {
			if(visited[k]==true) {
				return false;
			}
		}
		return true;
	
	}

	public static boolean iscbnumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
