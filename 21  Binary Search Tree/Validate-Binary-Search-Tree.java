 public boolean isValidBST(TreeNode root) {
        // Time Complexity :o(n)
        // Space Complexity : o(n)
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public static boolean check(TreeNode root,long minValue,long maxValue)
    {
         if(root==null)
             return true;
         if(root.val<=minValue || root.val>=maxValue)
             return false;
         return check(root.left,minValue,root.val) && check(root.right,root.val,maxValue);
    }
