   public TreeNode searchBST(TreeNode root, int val) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
          
        if(root==null)
            return null;
         if(root.val==val)
             return root;
         if(root.val>val)
             return searchBST(root.left,val);
          return searchBST(root.right,val);
        
    }
