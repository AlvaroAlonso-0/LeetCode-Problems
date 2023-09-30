/*
* Given the root of a binary tree, the level of its root is 1, 
* the level of its children is 2, and so on.
* 
* Return the smallest level x such that the sum of all the values 
* of nodes at level x is maximal. 
*/

import java.util.List;

import javax.swing.tree.TreeNode;

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
    private List<Integer> list = new ArrayList<>();
    public int maxLevelSum(TreeNode root) {
        sum(root, 0);

        int max = list.get(0), level = 1;

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
                level = i + 1;
            }
        }

        return level;
    }
    private void sum(TreeNode root, int level) {
        if (root != null) {
            if(level >= list.size())
                list.add(root.val);
            else
                list.set(level, list.get(level) + root.val);
            
            sum(root.left, level + 1);
            sum(root.right, level + 1);
        }
    }
}