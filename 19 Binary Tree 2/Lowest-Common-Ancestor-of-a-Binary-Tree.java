  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        return findLCS(root,p,q);
    }
    public static TreeNode findLCS(TreeNode root, TreeNode p,TreeNode q)
    {
         if(root==null)
             return null;
         if(root==p || root==q)
             return root;
         TreeNode left=findLCS(root.left,p,q);
         TreeNode right=findLCS(root.right,p,q);
         if(left!=null && right!=null)
             return root;
         if(left==null)
             return right;
        return left;
    }
