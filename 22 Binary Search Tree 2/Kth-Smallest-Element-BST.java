class Solution {
    static int kthEle=-1,element=-1;
    public int kthSmallest(TreeNode root, int k) {
        // Time Complexity : o(min(n,k))
        // Space Complexity : o(min(n,k))
        kthEle=k;
        inorder(root);
        return element;
    }
    public static void inorder(TreeNode root)
    {
         if(root==null)
         return;
           if(kthEle<=0)
           return;
          inorder(root.left);
            kthEle--;
             if(kthEle==0)
             {
              element=root.val;
              return;
             }
            inorder(root.right);
    }
}
