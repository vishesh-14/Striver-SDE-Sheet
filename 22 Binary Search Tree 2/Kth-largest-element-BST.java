class Solution
{
    static int kthElement=-1,element=-1;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        // Time Complexity : o(min(n,k))
        // Space Complexity : o(min(h,n))
        kthElement=K;
          findElement(root);
        return element;
    }
    public static void findElement(Node root)
    {
         if(root==null)
         return;
          if(kthElement<=0)
          return;
         findElement(root.right);
           kthElement--;
            if(kthElement==0)
            {
                element=root.data;
                return;
            }
        findElement(root.left);
    }
}Kth largest element in BST
