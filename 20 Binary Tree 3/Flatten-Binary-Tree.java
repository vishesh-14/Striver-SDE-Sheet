class Solution {
    static TreeNode dummy = new TreeNode();
     static TreeNode prev=dummy;
    public void flatten(TreeNode root) {
     // Time Complexity : o(n)
     // Space Complexity : o(n)
        preorder(root);
    }
    public static void preorder(TreeNode root)
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
