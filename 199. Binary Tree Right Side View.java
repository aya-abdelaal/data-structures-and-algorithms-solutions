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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList();
        List<TreeNode> temp = new ArrayList();
        if(root != null)
            temp.add(root);
        while(!temp.isEmpty()){
            int size = temp.size();
            list.add(temp.get(size - 1).val);
            

            for(int i = 0; i < size;i++){
                TreeNode n = temp.remove(0);
                if(n.left!= null)temp.add(n.left);
                if(n.right != null) temp.add(n.right);
            }
        }
        return list;
    }

}
