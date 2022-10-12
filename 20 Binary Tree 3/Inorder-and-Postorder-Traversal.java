class Solution {
    static int pidx=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
         pidx=inorder.length-1; 
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
         for(int i=0;i<inorder.length;i++)
             map.put(inorder[i],i);
        return buildTree(0,inorder.length-1,postorder,map);
    }
    public static TreeNode buildTree(int start,int end,int[] postorder,HashMap<Integer,Integer> map)
    {
          if(start>end)
              return null;
        TreeNode nm=new TreeNode(postorder[pidx]);
         int idx=map.get(postorder[pidx]);
          pidx--;
         nm.right=buildTree(idx+1,end,postorder,map);
         nm.left=buildTree(start,idx-1,postorder,map);
        
        return nm;
        
    }
}
