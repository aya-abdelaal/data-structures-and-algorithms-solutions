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
    public List<Double> averageOfLevels(TreeNode root) {


        List<Double> res = new ArrayList<Double>();
        List<TreeNode> q = new ArrayList<TreeNode>();

        if(root == null)
            return res;

        q.add(root);

        while(!q.isEmpty()){
            int p = q.size();
            double sum = 0;
            for(int i = 0; i  < p; i++){
                TreeNode curr = q.remove(0);
                if(curr.right != null ) q.add(curr.right);
                if(curr.left != null ) q.add(curr.left);
                sum+= curr.val;
            }
            res.add(sum/p);
        }

        return res;
    }
}
