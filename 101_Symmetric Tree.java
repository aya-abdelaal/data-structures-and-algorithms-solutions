/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return helper(root.right, root.left);
    }

    public static boolean helper(TreeNode right, TreeNode left){
        if(right == null && left == null)
            return true;
        if(right == null || left == null)
            return false;
        if(right.val != left.val)
            return false;
        return true && helper(right.right, left.left) && helper(right.left,left.right);
    }
}
