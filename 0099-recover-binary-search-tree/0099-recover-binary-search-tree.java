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
    public void inorder(TreeNode root,List<TreeNode> list){
        if(root==null)return;
        inorder(root.left,list);
        list.add(root);
        inorder(root.right,list);
    }
    public void recoverTree(TreeNode root) {
      List<TreeNode> list = new ArrayList<>();
      inorder(root,list);
      TreeNode first = null, second = null;
     for(int i=0;i<list.size()-1;i++){
           if(list.get(i).val>list.get(i+1).val){
             if(first == null) first = list.get(i);
             second = list.get(i+1);
           }
     }
     int temp = first.val;
     first.val = second.val;
     second.val = temp;
    }
}