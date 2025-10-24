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
    public void numbers(TreeNode root, List<String> list,StringBuilder sb){
        if(root==null)return;
        sb.append(root.val);
        if(root.right==null&&root.left==null){
            list.add(sb.toString());
        }else{
            numbers(root.left,list,sb);
            numbers(root.right,list,sb);
        }
         sb.deleteCharAt(sb.length()-1);
    }
    public int sumNumbers(TreeNode root) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        numbers(root,list,sb);
        int sum=0;
        for(int i=0;i<list.size();i++){
           sum+=Integer.valueOf(list.get(i));
        }
        return sum;
    }
}