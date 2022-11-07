 public boolean findTarget(TreeNode root, int k) {
        // Time Complexity : o(n)
        // Space Complexity : o(n+h)
         HashSet<Integer> set=new HashSet<>();
        return check(root,k,set);
    }
    public static boolean check(TreeNode root,int k ,HashSet<Integer> set)
    {
           if(root==null)
           return false;
           boolean left=check(root.left,k,set);
            if(left)
            return left;
             if(set.contains(k-root.val))
             return true;
              set.add(root.val);
            return check(root.right,k,set);
    }
