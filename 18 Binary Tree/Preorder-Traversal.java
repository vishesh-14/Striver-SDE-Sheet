 public static void preOrderIterative(TreeNode root)
    {
        // Time Complexity: o(n)
        // Space Complexity: o(n)
        if(root==null)
            return ;
        
        ArrayDeque<TreeNode> st =new ArrayDeque<TreeNode>();
         st.push(root);
         while(!st.isEmpty())
         {
             TreeNode top=st.peek();
             st.pop();
              order.add(top.val);
             if(top.right!=null)
              st.push(top.right);
             if(top.left!=null)
              st.push(top.left);
                 
         }
    }
//-----------------------------------------------------------------//
public static void preOrderRecursive(TreeNode root)
    {
        // Time Complexity :o(n)
        // Space Compleixty : o(n)
         if(root==null)
             return ;
          order.add(root.val);
          preOrderRecursive(root.left);
          preOrderRecursive(root.right);
    }
