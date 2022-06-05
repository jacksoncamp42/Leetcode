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
    public int maxDiameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;        
    }
    
    public int dfs(TreeNode root) {
        if(root == null) return -1;
        
        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);        
        int currHeight = 1 + Math.max(leftHeight, rightHeight);
        int currDiameter = 2 + leftHeight + rightHeight;
        maxDiameter = Math.max(maxDiameter,currDiameter);
        return currHeight;
    }
}