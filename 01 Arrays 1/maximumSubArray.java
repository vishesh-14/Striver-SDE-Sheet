public int maxSubArray(int[] nums) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
         int n=nums.length;
        int sum=0,res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
             if(sum<0)
                 sum=0;
            sum=Math.maxsum+nums[i];
            res=Math.max(res,sum);
        }
        return res;
    }
