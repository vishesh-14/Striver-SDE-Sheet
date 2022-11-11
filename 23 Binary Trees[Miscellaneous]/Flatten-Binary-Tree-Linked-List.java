class Solution {
    TreeNode dummy=new TreeNode();
 TreeNode prev=dummy;
    public void flatten(TreeNode root) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        preorder(root);
    }
    public  void preorder(TreeNode root)
    {
         if(root==null)
             return ;
        TreeNode right=root.right;
        prev.right=root;
          prev=root;
         preorder(root.left);
        root.left=null;
        preorder(right);

    }
}