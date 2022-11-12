public int findKthLargest(int[] nums, int k) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        int len=nums.length;
        return findElement(0,len-1,len-k,nums);
    }
    public static int findElement(int low,int high,int k,int [] nums)
    {
         if(low>high)
         return -1;
          int  idx=findParition(low,high,nums);
           if(idx==k)
           return nums[idx];
           if(idx>k)
           return findElement(low,idx-1,k,nums);
           return findElement(idx+1,high,k,nums);
    }
    public static int findParition(int low,int high,int [] nums)
    {
         int pivot=nums[high],pidx=low;
          while(low<high)
          {
               if(nums[low]<=pivot)
               {
                   swap(nums,low,pidx);
                   pidx++;
               }
               low++;
          }
          swap(nums,pidx,high);
          return pidx;
    }
    public static void swap(int [] nums,int i,int j)
    {
         int temp=nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
    }
