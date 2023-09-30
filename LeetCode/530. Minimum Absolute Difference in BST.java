/*
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
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
    public static void dfs(TreeNode root,ArrayList<Integer> list){
        if(root!=null){
            dfs(root.left,list);
            // System.out.println(list);
            list.add(root.val);
            dfs(root.right,list);
        }
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        dfs(root,list);
        int min=Integer.MAX_VALUE;
        // System.out.println(list);
        for(int i=1;i<list.size();i++){
            if(min>(list.get(i)-list.get(i-1)))
            min=list.get(i)-list.get(i-1);
        }
        return min;
    }
}
