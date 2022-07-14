public int majorityElement(int[] nums) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
         int n=nums.length,count=0,ele=-1;
        for(int i=0;i<n;i++)
        {
            if(count==0)
             ele=nums[i];
            if(nums[i]==ele)
                count++;
            else
                count--;
        }
        return ele;
    }
