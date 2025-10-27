/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public void connecting(Node root){
        if(root==null||root.right==null||root.left==null)return;
        root.left.next=root.right;
        if(root.next!=null) root.right.next=root.next.left;
        connecting(root.left);
        connecting(root.right);
    }
    public Node connect(Node root) {
        connecting(root);
        return root;
    }
}