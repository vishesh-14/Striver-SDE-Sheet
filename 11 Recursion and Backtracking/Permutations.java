class Solution {
    static List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        // Time Complexity : 0(N!*N)
        // Space Complexity : o(N!)
        result.clear();
         generateAllPermutation(0,nums);
        return result;
    }
    public static void generateAllPermutation(int idx,int [] nums)
    {
         int n=nums.length;
         if(idx==n)
         {
             ArrayList<Integer> sub_res= new ArrayList<Integer>();
             for(int i=0;i<n;i++)
                 sub_res.add(nums[i]);
             result.add(sub_res);
             return ;
         }
         for(int j=idx;j<n;j++)
         {
              swap(idx,j,nums);
             generateAllPermutation(idx+1,nums);
             swap(idx,j,nums);
         }
    }
    public static void swap(int i,int j,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}