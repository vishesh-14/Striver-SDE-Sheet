class Solution{
    static ArrayList<Integer> subsetSum= new ArrayList<Integer>();
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // Time Compleixty : o(2^N)
        // Space Complexity : o(2^N)
        subsetSum.clear();
          
       generateSubsets(N-1,0,arr);
        return subsetSum;
    }
    public static void generateSubsets(int idx, int sum,ArrayList<Integer> arr)
    {
         if(idx<0)
         {
             subsetSum.add(sum);
             return;
         }
         generateSubsets(idx-1,sum,arr);
          generateSubsets(idx-1,sum+arr.get(idx),arr);
    }
}