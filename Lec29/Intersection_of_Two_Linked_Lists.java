package Lec29;

public class Intersection_of_Two_Linked_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode baba = headA;
			ListNode vgf = headB;
			while (baba != vgf) {
				if (baba == null) {
					baba = headB;
				} else {
					baba = baba.next;
				}
				if (vgf == null) {
					vgf = headA;
				} else {
					vgf = vgf.next;
				}
			}
			return vgf;

		}
	}

}



