 public int reversePairs(int[] nums) {
        // Time Complexity : o(nlogn)
        // Space Complexity : o(n)
        return mergeSort(0,nums.length-1,nums);
    }
    public static int  mergeSort(int low,int high,int [] nums)
    {
         if(low>=high)
             return 0;
        int mid=(low+high)/2;
         int   left=mergeSort(low,mid,nums);
        int   right=mergeSort(mid+1,high,nums);
        return left+right+merge(low,mid,high,nums);
    }
    public static int   merge(int low,int mid,int high,int[] nums)
    {
         int [] temp =new int [high-low+1];
        int p1=low,p2=mid+1,p3=0,j=mid+1;
        int  count=0;
        // Important step in calcuting the answer
         for(int i=low;i<=mid;i++)
         {
              while(j<=high && nums[i]>2L*nums[j])
              {
                  j++;
              }
             count=count+j-(mid+1);
         }
        while(p1<=mid && p2<=high)
        {
             if(nums[p1]<nums[p2])
                 temp[p3++]=nums[p1++];
            else
            {
               
                
                temp[p3++]=nums[p2++];
            }
        }
        while(p1<=mid)
            temp[p3++]=nums[p1++];
        while(p2<=high)
            temp[p3++]=nums[p2++];
        for(int i=0;i<temp.length;i++)
            nums[low+i]=temp[i];
        return count;
    }
