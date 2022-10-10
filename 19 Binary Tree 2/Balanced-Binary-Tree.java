class Solution {
    boolean balanced=true;
    public boolean isBalanced(TreeNode root) {
        // Time Compleixty : o(n)
        // Space Complexity : o(n)
        balanced=true;
         height(root);
        return balanced;
    }
    public  int height(TreeNode root)
    {
         if(root==null)
             return -1;
         int left=height(root.left);
         int right=height(root.right);
         if(Math.abs(left-right)>1)
             balanced=false;
        return 1+Math.max(left,right);
        
    }
}
