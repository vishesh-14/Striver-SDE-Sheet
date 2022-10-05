 public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        List<List<Integer>> result=new ArrayList<>();
         result.add(new ArrayList<Integer>());
         result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
         doDfs(root,result);
        // Write your code here.
             return result;
    }
 public static void doDfs(BinaryTreeNode<Integer> root,List<List<Integer>> result)
  {
      if(root==null)
          return ;
     result.get(1).add(root.data);
     doDfs(root.left,result);
     result.get(0).add(root.data);
      doDfs(root.right,result);
     result.get(2).add(root.data);
  }
