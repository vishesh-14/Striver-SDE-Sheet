public int maxProfit(int[] nums) {
        //Time Complexity : o(n)
        // Space Complexity : o(1)
        int n=nums.length;
       int min=nums[0],maxProfit=0;
        for(int i=1;i<n;i++)
        {
            min=Math.min(min,nums[i]);
            maxProfit=Math.max(maxProfit,nums[i]-min);
        }
        return maxProfit;
    }
