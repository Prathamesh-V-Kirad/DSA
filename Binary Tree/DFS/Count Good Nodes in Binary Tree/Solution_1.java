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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
    private int dfs(TreeNode node, int maxVal) {
        if (node == null) {
            return 0;
        }
        
        int goodNodesCount = 0;
        if (node.val >= maxVal) {
            goodNodesCount = 1;
        }
        maxVal = Math.max(maxVal, node.val);
        goodNodesCount += dfs(node.left, maxVal);
        goodNodesCount += dfs(node.right, maxVal);
        
        return goodNodesCount;
    }
}