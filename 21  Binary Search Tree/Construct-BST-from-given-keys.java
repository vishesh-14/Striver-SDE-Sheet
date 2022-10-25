public TreeNode sortedArrayToBST(int[] nums) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        return  generateTree(nums,0,nums.length-1);
    }
    public static TreeNode generateTree(int [] nums,int low,int high)
    {
         if(low>high)
             return null;
          int mid=(low+high)/2;
           TreeNode  nm=new TreeNode(nums[mid]);
         nm.left=generateTree(nums,low,mid-1);
         nm.right=generateTree(nums,mid+1,high);
        return nm;
    }
