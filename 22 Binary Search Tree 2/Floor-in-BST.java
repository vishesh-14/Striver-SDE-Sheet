public static int  findFloor(TreeNode<Integer> root,int X)
    {
         if(root==null)
             return Integer.MAX_VALUE;
           if(root.data>X)
              return findFloor(root.left,X);
         int right=findFloor(root.right,X);
          if(X-root.data>Math.abs(X-right))
              return right;
        return root.data;
    }