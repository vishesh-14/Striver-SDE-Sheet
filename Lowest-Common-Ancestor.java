 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Time Complexity : o(h)
        // Space Complexity : o(h)
        return findLCA(root,p,q);
    }
    public static TreeNode findLCA(TreeNode root,TreeNode p,TreeNode q)
    {
         if(root==null)
             return null;
         if(root.val>p.val && root.val>q.val)
             return findLCA(root.left,p,q);
        else if(root.val<p.val && root.val<q.val)
            return findLCA(root.right,p,q);
        return root;
    }
