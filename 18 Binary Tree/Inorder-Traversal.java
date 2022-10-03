  // Important  Iterative Approach 
    public static void inorderIterative(TreeNode root)
    {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        ArrayDeque<TreeNode> st=new ArrayDeque<TreeNode>();
         addLeft(root,st);
        while(!st.isEmpty())
        {
            TreeNode top=st.peek();
            st.pop();
            order.add(top.val);
            addLeft(top.right,st);
        }
    }
    public static void addLeft(TreeNode root,ArrayDeque<TreeNode> st)
    {
         while(root!=null)
          { 
              st.push(root);
              root=root.left;
          }
    }
//-------------------------------------------------------------------------------//
    public static void inorderRecursive(TreeNode root)
    {
        // Time Complexity : o(n)
        // Space Complexity :o(n)
         if(root==null)
             return ;
         doInorder(root.left);
          order.add(root.val);
        doInorder(root.right);
    }