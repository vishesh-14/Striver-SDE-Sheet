class Solution {
    static int pidx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Time Complexity  : o(n)
        //Space Complexity : o(n)
         pidx=0;
        return buildTree(0,inorder.length-1,inorder,preorder);
    }
    public static TreeNode buildTree(int start,int end,int [] inorder,int[] preorder)
    {
         if(start>end)
             return null;
         TreeNode nm =new TreeNode(preorder[pidx]);
         int idx=findIndex(start,end,inorder,preorder[pidx]);
         pidx++;
         nm.left=buildTree(start,idx-1,inorder,preorder);
         nm.right=buildTree(idx+1,end,inorder,preorder);
        return nm;
    }
    public static int findIndex(int start,int end,int [] inorder,int target)
    {
         for(int i=start;i<=end;i++)
         {
              if(inorder[i]==target)
                  return i;
         }
        return -1;
    }
}
