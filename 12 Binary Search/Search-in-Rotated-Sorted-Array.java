public int search(int[] nums, int target) {
        // Time Complexity : o(logn)
        // Space Complexity : o(1)
         int n=nums.length;
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
             if(nums[mid]==target)
                 return  mid;
             if(nums[low]<=nums[mid])
             {
                  if(nums[mid]>target && target>=nums[low])
                      high=mid-1;
                   else
                       low=mid+1;
             }
             else
             {
                  if(target>nums[mid] && target<=nums[high])
                      low=mid+1;
                   else
                        high=mid-1;
             }
        }
        return -1;
    }
