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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        Stack<TreeNode> stack = new Stack();
        Stack<Integer> stack2 = new Stack();

        stack.add(root);
        stack2.add(1);
        
        int max = 1;
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int depth = stack2.pop();
            
            if(node != null) {
                max = Math.max(max,depth);
                stack.add(node.left);
                stack2.add(depth + 1);
                
                stack.add(node.right);
                stack2.add(depth + 1);
            }
        }
        return max;
    }
}