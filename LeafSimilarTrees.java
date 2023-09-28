/*
 * Consider all the leaves of a binary tree, from left to right order, 
 * the values of those leaves form a leaf value sequence.
 * 
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * 
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * 
 * Return true if and only if the two given trees with head nodes root1 
 * and root2 are leaf-similar.
 */

import java.util.ArrayList;

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
    ArrayList<Integer> s = new ArrayList<Integer>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        leaf(root1);
        int size = s.size();
        leaf(root2);
        if((s.size()&1)!=0) return false;

        for(int i=0; i<size; i++){
            if(s.get(i) != s.get(i+size)) return false;
        }
        return true;
    }
    private void leaf(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s.add(root.val);
            return;
        }
        leaf(root.left);
        leaf(root.right);
    }
}