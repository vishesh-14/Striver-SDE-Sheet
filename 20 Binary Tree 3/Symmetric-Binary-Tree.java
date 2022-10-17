 public boolean isSymmetric(TreeNode root) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)

        return check(root.left,root.right);
    }
   
    public static boolean check(TreeNode leftPart,TreeNode rightPart)
    {
         if(leftPart==null && rightPart==null)
          return  true;
          if(leftPart==null || rightPart==null)
              return false;
         //System.out.println(leftPart.val+" "+rightPart.val);
        return leftPart.val==rightPart.val && check(leftPart.left,rightPart.right) && check(leftPart.right,rightPart.left);
        
        
    }
