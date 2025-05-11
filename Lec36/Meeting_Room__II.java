package Lec36;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Room__II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 } };
		Arrays.sort(intervals, (a, b) -> b[0] - a[0]);
		for (int i = 0; i < intervals.length; i++) {
			for (int j = 0; j < intervals[0].length; j++) {
				System.out.print(intervals[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int minMeetingRooms(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);// start wise Sorting
		
		PriorityQueue<int []> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if(pq.peek()[1]>intervals[i][0]) {
		
				pq.add(intervals[i]);
			}
			else {
				pq.poll();
				pq.add(intervals[i]);
			}
		}
		return pq.size();

	}

}





