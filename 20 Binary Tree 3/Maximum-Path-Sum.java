class Solution {
    static int maxiSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        maxiSum=Integer.MIN_VALUE;
         findMaxSum(root);
       return maxiSum;
    }
    public static int findMaxSum(TreeNode root)
    {
         if(root==null)
             return 0;
         int left=findMaxSum(root.left);
         int right=findMaxSum(root.right);
         maxiSum=Math.max(maxiSum,left+root.val);
         maxiSum=Math.max(maxiSum,right+root.val);
         maxiSum=Math.max(maxiSum,left+right+root.val);
        maxiSum=Math.max(maxiSum,root.val);
        return Math.max(root.val,Math.max(left+root.val,right+root.val));
    }
}