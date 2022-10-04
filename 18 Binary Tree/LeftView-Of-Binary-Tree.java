 ArrayList<Integer> leftView(Node root)
    {
      // Time Complexity : o(n)
      // Space Complexity : o(n)
      ArrayList<Integer> result=new ArrayList<Integer>();
       preorder(root,0,result);
        
        
       return result;
      
    }
    public  void preorder(Node root,int level,ArrayList<Integer> result)
    {
         if(root==null)
         return ;
          if(result.size()==level)
           result.add(root.data);
            preorder(root.left,level+1,result);
            preorder(root.right,level+1,result);
    }
