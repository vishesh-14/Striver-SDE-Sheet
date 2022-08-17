public int singleNonDuplicate(int[] nums) {
        // Time Complexity : o(logn)
        // Space Complexity : o(1)
       // Why we are   making high to point to n-2 position?
        // Ans :  consider a array [1,1,2,2,3] in this  if we  made our 
        // high to point to last index only left part will shrink 
        // we may end with index out of bounds while comparing 
        // so in order to overcome that we start at n-2 index
        int low=0,high=nums.length-2;
        while(low<=high)
        {
              int mid=(low+high)/2;
              if(nums[mid]==nums[mid^1])
                  low=mid+1;
               else
                high=mid-1; 
        }
        return nums[low];
    }
