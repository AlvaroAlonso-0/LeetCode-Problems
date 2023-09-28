/*
 * Given a binary tree root, a node X in the tree is named good if in the 
 * path from root to X there are no nodes with a value greater than X.
 * 
 * Return the number of good nodes in the binary tree.
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
    int g = 0;
    public int goodNodes(TreeNode root) {
        good(root, root.val);
        return g;   
    }
    private void good(TreeNode root, int max){
        if(root == null) return;
        if(root.val >= max) g++;
        good(root.left, Math.max(root.val, max));
        good(root.right, Math.max(root.val, max));
    }
}