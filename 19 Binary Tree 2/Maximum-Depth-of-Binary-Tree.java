 public int maxDepth(TreeNode root) {
        // Time Compleixty : o(n)
        // Space Compliexity : o(n)
        return findDepth(root);
    }
    public static int findDepth(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=findDepth(root.left);
        int right=findDepth(root.right);
        return 1+Math.max(left,right);
    }
