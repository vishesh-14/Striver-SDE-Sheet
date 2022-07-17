public void moveZeroes(int[] nums) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        int n=nums.length,p1=0;
        for(int i=0;i<n;i++)
        {
             if(nums[i]!=0)
             {
                 swap(nums,i,p1);
                 p1++;
             }
        }
    }
    public static void swap(int[] nums,int i,int j)
    {
         int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
