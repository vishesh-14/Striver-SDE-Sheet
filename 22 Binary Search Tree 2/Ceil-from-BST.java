public  static int findCeil(TreeNode<Integer> node, int x) {

        // Time Complexity : o(n)
        // Space Complexity : o(n)
        int result=nextGreater(node,x);
        if(result>=Integer.MAX_VALUE)
            return -1;
        return result;

    }
    public static int nextGreater(TreeNode<Integer> root,int x)
    {
        if(root==null)
            return Integer.MAX_VALUE;
          if(x>root.data) 
            return nextGreater(root.right,x);
        int left=nextGreater(root.left,x);
         if(root.data-x>Math.abs(left-x))
             return left;
        return root.data;
        
    }Ceil from BST
