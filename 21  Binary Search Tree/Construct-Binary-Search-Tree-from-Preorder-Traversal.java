class Solution {
    static int pidx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        int len=preorder.length;
        
         pidx=0;
        int [] inorder=new int[len];
        for(int i=0;i<len;i++)
            inorder[i]=preorder[i];
            Arrays.sort(inorder);
        return buildTree(0,inorder.length-1,inorder,preorder);
        
    }
    public static TreeNode buildTree(int low,int high,int [] inorder,int [] preorder)
    {
         if(low>high)
             return null;
         TreeNode nm=new TreeNode(preorder[pidx]);
          int idx=getIndex(low,high,preorder[pidx++],inorder);
         nm.left=buildTree(low,idx-1,inorder,preorder);
         nm.right=buildTree(idx+1,high,inorder,preorder);
        return nm;
    }
    public static int getIndex(int low,int high,int ele,int [] inorder)
    {
         for(int i=low;i<=high;i++)
         {
              if(inorder[i]==ele)
                  return i;
         }
        return -1;
    }
}
