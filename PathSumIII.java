/*
 * Given the root of a binary tree and an integer targetSum, return 
 * the number of paths where the sum of the values along the path equals targetSum.
 * 
 * The path does not need to start or end at the root or a leaf, but 
 * it must go downwards (i.e., traveling only from parent nodes to child nodes).
 */

import java.util.HashMap;
import java.util.Map;

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
        int[] ans = new int[1];
        Map<Long, Integer> map = new HashMap<>();
        map.put((long)0, 1);
        pathSum(root, targetSum, 0, map, ans);
        return ans[0];
    }
    private void pathSum(TreeNode root, int targetSum, long sum, Map<Long, Integer> map, int[] ans) {
        if (root == null) return;
        sum += root.val;

        if(map.containsKey(sum - targetSum) && map.get(sum - targetSum) > 0) {
            ans[0] += map.get(sum - targetSum);
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        pathSum(root.left, targetSum, sum, map, ans);
        pathSum(root.right, targetSum, sum, map, ans);
        map.put(sum, map.getOrDefault(sum, 0) - 1);
    }
}