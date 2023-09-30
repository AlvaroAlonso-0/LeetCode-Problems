/*
 * Given the root of a binary tree, imagine yourself standing 
 * on the right side of it, return the values of the nodes you 
 * can see ordered from top to bottom.
 */

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
        List<Integer> list = new ArrayList<>();
        view(root, list, 0);
        return list;
    }
    private void view(TreeNode root, List<Integer> list, int depth) {
        if (root != null) {
            if (depth == list.size())
                list.add(root.val);
            
            view(root.right, list, depth + 1);
            view(root.left, list, depth + 1);
        }
    }
}