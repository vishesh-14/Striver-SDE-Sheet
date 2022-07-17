public int subarraysDivByK(int[] nums, int k) {
        // Time Complexity :o(n)
        // Space Complexity :o(n)
         int ans=0,n=nums.length,sum=0;
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            int rem=(sum)%k;
             if(rem<0)
                rem=rem+k;
             if(rem==0)
                 ans++;
         
            if(h.containsKey(rem))
            {
                ans=ans+h.get(rem);
            }
      
            h.put(rem,h.getOrDefault(rem,0)+1);
        }
        return ans;
    }
