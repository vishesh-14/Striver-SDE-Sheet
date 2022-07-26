 public int removeDuplicates(int[] nums) {
      // Time Complexity : o(n)
      // Space Complexity : o(1)
        int n=nums.length;
        int p1=0;
        for(int i=0;i<n;i++)
        {
            while(i+1<n && nums[i]==nums[i+1])
                 i++;
            nums[p1++]=nums[i];
        }
        return p1;
    }
