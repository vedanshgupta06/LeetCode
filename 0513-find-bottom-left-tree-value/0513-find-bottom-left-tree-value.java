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
    public int level(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public void check(TreeNode root,int level,int lvl,int[] arr,boolean[] flag){
        if(root==null)return;
        if(flag[0])return;
        if(lvl==level){
           arr[0]=root.val;
           flag[0]=true;
            return;
        }
        check(root.left,level,lvl+1,arr,flag);
        check(root.right,level,lvl+1,arr,flag);
    }
    public int findBottomLeftValue(TreeNode root) {
        int lev = level(root);
        int value=0;
        int[] arr=new int[1];
        boolean[] flag=new boolean[1];
        check(root,lev,1,arr,flag);
        return arr[0];
    }
}