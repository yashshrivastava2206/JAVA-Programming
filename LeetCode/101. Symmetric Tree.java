/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
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
    public boolean isSymmetric(TreeNode root)
    {    
        return isMirror(root.left, root.right);
    }
        public boolean isMirror(TreeNode L, TreeNode R)
        {   // BASE CASE
            if(L == null && R == null) return true;
            if(L == null || R == null) return false;
            // CHECK VALUES
            if(L.val != R.val) return false;
             //CHECK LEFT SUBTREE AND RIGHT SUBTREE
            return isMirror(L.left,R.right)
                   && isMirror(L.right,R.left);
        }
 }
