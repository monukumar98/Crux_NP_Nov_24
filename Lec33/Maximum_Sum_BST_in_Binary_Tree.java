package Lec33;
public class Maximum_Sum_BST_in_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int maxSumBST(TreeNode root) {
			return ValidBST(root).sum;

		}
		public BstPair ValidBST(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbp = ValidBST(root.left);
			BstPair rbp = ValidBST(root.right);
			BstPair sbp = new BstPair();
			sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
			sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
			sbp.sum=lbp.sum+rbp.sum+root.val;
			sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
			return sbp;

		}

		class BstPair {
			boolean isbst = true;
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int sum=0;
		}
	}
}











