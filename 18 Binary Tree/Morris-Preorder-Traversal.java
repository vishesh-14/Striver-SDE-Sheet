public static void inorderMorris(TreeNode root)
    {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        TreeNode curr=root;
        while(curr!=null)
        {
             if(curr.left==null)
             {
                 order.add(curr.val);
                 curr=curr.right;
             }
            else
            {
                 TreeNode prev=curr.left;
                 while(prev.right!=null && prev.right!=curr)
                     prev=prev.right;
                if(prev.right==null)
                {
                    prev.right=curr;
                   order.add(curr.val);
                    curr=curr.left;
                }
                else
                {
                    prev.right=null;
                   
                    curr=curr.right;
                }
            }
        }
    }
