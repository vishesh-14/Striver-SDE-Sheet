public static void postOrderRecursive(TreeNode root)
    {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
         if(root==null)
             return;
          postOrderRecursive(root.left);
          postOrderRecursive(root.right);
          order.add(root.val);
    }
 //-------------------------------------------------------------------//
  public static void  postOrderIterative(TreeNode root)
    {
        // Time Complexity: o(n)
        // Space Complexity: o(n+n)
         if(root==null)
             return;
        ArrayDeque<TreeNode> st1=new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> st2=new ArrayDeque<TreeNode>();
        st1.push(root);
         while(!st1.isEmpty())
         {
             TreeNode top=st1.peek();
             st1.pop();
             
              st2.push(top);
              if(top.left!=null)
                  st1.push(top.left);
               if(top.right!=null)
                   st1.push(top.right);
             
         }
        while(!st2.isEmpty())
        {
            TreeNode top=st2.peek();
            st2.pop();
            order.add(top.val);
        }
    }
