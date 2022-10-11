public static ArrayList<Integer> traverseBoundary(TreeNode root){
		// Write your code here.
        // Time Complexity : o(n)
        // Space Compexity : o(n)
        ArrayList<Integer> result=new ArrayList<Integer>();
        result.add(root.data);
        if(root.left==null && root.right==null)
            return result;
        TreeNode temp=root.left;
        while(temp!=null)
        {
            if(temp.left==null && temp.right==null)
                break;
            result.add(temp.data);
             if(temp.left==null)
                 temp=temp.right;
             else
                 temp=temp.left;
        }
         addLeafNode(root,result);
        ArrayList<Integer> sub_result=new ArrayList<Integer>();
        temp=root.right;
         while(temp!=null)
         {
             if(temp.left==null && temp.right==null)
                 break;
             sub_result.add(temp.data);
              if(temp.right==null)
                  temp=temp.left;
             else
                 temp=temp.right;
         }
        for(int i=sub_result.size()-1;i>=0;i--)
            result.add(sub_result.get(i));
        return result;
	}
    public static void addLeafNode(TreeNode root,ArrayList<Integer> result)
    {
         if(root==null)
             return ;
         if(root.left==null && root.right==null)
         {
              result.add(root.data);
             return;
         }
         addLeafNode(root.left,result);
         addLeafNode(root.right,result);
    }
