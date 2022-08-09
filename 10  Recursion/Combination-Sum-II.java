class Solution {
    static List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Time Complexity : o(2^N)
        // Space Complexity : o(x*k)
         int n=candidates.length;
        result.clear();
        Arrays.sort(candidates);
        ArrayList<Integer> sub_res= new ArrayList<Integer>();
          findCombinations(0,candidates,target,sub_res);
        return result;
    }
    public static void findCombinations(int idx,int [] candidates,int target,ArrayList<Integer> sub_res)
    {
         if(target==0)
         {
             result.add(new ArrayList<>(sub_res));
             return;
         }
           int n=candidates.length;
         for(int i=idx;i<n;i++)
         {
              if(i!=idx && candidates[i]==candidates[i-1])
                  continue;
              if(target>=candidates[i])
              {
                  sub_res.add(candidates[i]);
                   findCombinations(i+1,candidates,target-candidates[i],sub_res);
                  sub_res.remove(sub_res.size()-1);
              }
         }
    }
}
