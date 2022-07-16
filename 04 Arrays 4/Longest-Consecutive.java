public int longestConsecutive(int[] nums) {
        // TimeComplexity : o(n+n+n)
        // SpaceComplexity :o(n)
         int n=nums.length;
        HashSet<Integer> hs = new HashSet<Integer>();
         for(int x : nums)
             hs.add(x);
        int ans=0;
        for(int i=0;i<n;i++)
        {
             if(!hs.contains(nums[i]-1))
             {
                 int x=nums[i];
                    while(hs.contains(x))
                    {
                        x++;
                    }
                 ans=Math.max(ans,x-nums[i]);
             }
        }
        return ans;
    }
