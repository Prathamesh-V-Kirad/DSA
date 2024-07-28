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
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0L, 1);
        return dfs(root, 0L, targetSum, prefixSums);
    }

    private int dfs(TreeNode node, long currSum, int targetSum, Map<Long, Integer> prefixSums) {
        if (node == null) {
            return 0;
        }
        
        currSum += node.val;
        int pathCount = prefixSums.getOrDefault(currSum - targetSum, 0);
        prefixSums.put(currSum, prefixSums.getOrDefault(currSum, 0) + 1);
        
        pathCount += dfs(node.left, currSum, targetSum, prefixSums);
        pathCount += dfs(node.right, currSum, targetSum, prefixSums);
        
        prefixSums.put(currSum, prefixSums.get(currSum) - 1);
        
        return pathCount;
    }
}