 public int[] twoSum(int[] nums, int target) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
         int n=nums.length;
        int [] res =  new int[2];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                res[0]=i;
                res[1]=hm.get(target-nums[i]);
               break;
            }
            hm.put(nums[i],i);
        }
        return res;
    }