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
    public void paths(TreeNode root, int target,List<List<Integer>> ans,List<Integer> path,int sum){
        if(root==null)return;
        path.add(root.val);
        sum+=root.val;
        if(root!=null && root.right==null && root.left==null){
            if(sum==target){
                ans.add(new ArrayList<>(path));
            }
        }else{
            paths(root.left,target,ans,path,sum);
            paths(root.right,target,ans,path,sum);
        }
        path.remove(path.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        paths(root,target,ans,path,0);
        return ans;
    }
}