 public int findMaxConsecutiveOnes(int[] nums) {
        // Time Complexity : o(n)
        // Space Complexity :o(1)
        int n=nums.length;
        int maxLen=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
            {
              int count=1;
              while(i+1<n && nums[i]==nums[i+1])
              {
                  i++;
                  count++;
              }
                maxLen=Math.max(maxLen,count);
            }
        }
        return maxLen;
    }
