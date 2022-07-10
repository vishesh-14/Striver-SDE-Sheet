public static  void nextPermutation(int[] nums) {
        // Time Complexity : n+n+n :o(n)
        // space Complexity : o(1)
        int p1=-1,n=nums.length;
        for(int i=n-1;i>0;i--)
        {
             if(nums[i]>nums[i-1])
             {
                 p1=i-1;
                 break;
             }
        }
        if(p1==-1)
        {
            reverse(nums,0,n-1);
            return;
        }
        int p2=0;
        for(int i=n-1;i>p1;i--)
        {
             if(nums[p1]<nums[i])
             {
                 p2=i;
                 break;
             }
        }
        swap(nums,p1,p2);
        reverse(nums,p1+1,n-1);
        
    }
    public static void swap(int [] nums,int i,int j)
    {
        int temp=nums[i];
         nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int [] nums,int i,int j)
    {
         while(i<j)
         {
             swap(nums,i,j);
             i++;
             j--;
         }
    }
