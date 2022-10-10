 int maxDiameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        // Time Compleixty : o(n)
        // Space Compleixty : o(n)
        maxDiameter=0;
        findHeight(root);
        return maxDiameter;
    }
    public  int findHeight(TreeNode root)
    {
         if(root==null)
             return -1;
         int left=findHeight(root.left);
        int  right=findHeight(root.right);
         maxDiameter=Math.max(maxDiameter,left+right+2);
        return 1+Math.max(left,right);
    }
