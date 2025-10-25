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
    public void path(TreeNode root, int target,int[] count){
        if(root==null)return;
        target-=root.val;
        if(target==0){
            count[0]++;
        }  
        path(root.left,target,count);
        path(root.right,target,count);
    }
    public int pathSum(TreeNode root, int target) {
        if(root==null)return 0;
        int[] count=new int[1];
        path(root,target,count);
        count[0]+=pathSum(root.left,target);
        count[0]+=pathSum(root.right,target);
        return count[0];
    }
}