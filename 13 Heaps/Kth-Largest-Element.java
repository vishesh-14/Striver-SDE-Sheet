// Using heap 
public int findKthLargest(int[] nums, int k) {
        // Time Complexity : o(klogk)
        // Space Compleixty : o(1)
        int n=nums.length;
        PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
        for(int i=0;i<k;i++)
            pq.add(nums[i]);
         for(int i=k;i<n;i++)
         {
              
              if(pq.peek()<nums[i])
              {
                  pq.poll();
                  pq.add(nums[i]);
              }
         }
        return pq.peek();
    }
// using Quick Select  Algorithm

 public int findKthLargest(int[] nums, int k) {
        // Time Complexity : o(k)
        // Space Compleixty : o(1)
        int n=nums.length;
       return quickSort(nums,0,nums.length-1,nums.length-k);
    }
    public static  int  quickSort(int [] nums,int low,int high,int k)
    {
        if(low>high)
            return -1;
        int pi=parition(nums,low,high);
         if(pi==k)
         return nums[pi];
         if(k>pi)
            return quickSort(nums,pi+1,high,k);
        else
            return quickSort(nums,0,pi-1,k);
    }
    public static int parition(int [] nums,int start,int end)
    {
         int pi=start,pivot=nums[end];
        while(start<end)
        {
            if(nums[start]<=pivot)
            {
                swap(nums,start,pi);
                pi++;
            }
            start++;
        }
        swap(nums,pi,end);
        return pi;
    }
    public static void swap(int [] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
