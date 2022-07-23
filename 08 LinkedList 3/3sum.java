public List<List<Integer>> threeSum(int[] nums) {
        // Time Complexity : o(nlogn+n^2)
        // Space Complexity : o(number of the unique triplets)
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
             int p1=i+1,p2=n-1;
            while(p1<p2)
            {
                int curr_sum=nums[i]+nums[p1]+nums[p2];
                 if(curr_sum==0)
                 {
                     while(i+1<n-2 && nums[i]==nums[i+1])
                         i++;
                     while(p1<p2 && nums[p1]==nums[p1+1])
                         p1++;
                     while(p1<p2 && nums[p2]==nums[p2-1])
                         p2--;
                     ArrayList<Integer> sub_res = new ArrayList<Integer>();
                      sub_res.add(nums[i]);
                     sub_res.add(nums[p1]);
                     sub_res.add(nums[p2]);
                      res.add(sub_res);
                 }
                if(curr_sum<0)
                    p1++;
                else
                    p2--;
            }
        }
        return res;
    }
