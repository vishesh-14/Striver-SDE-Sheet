static List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Time Complexity : o(2^N)
        // Space Complexity : o(x*k)
         int n=candidates.length;
        result.clear();
        ArrayList<Integer> sub_res= new ArrayList<Integer>();
           findCombinations(n-1,candidates,target,sub_res);
        return result;
    }
    public static void findCombinations(int idx,int [] candidates,int target,ArrayList<Integer> sub_res)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(sub_res));
            return;
        }
        if(idx<0)
        {
            
           return;
        }
         findCombinations(idx-1,candidates,target,sub_res);
         if(target>=candidates[idx])
         {
             sub_res.add(candidates[idx]);
            findCombinations(idx,candidates,target-candidates[idx],sub_res);
             sub_res.remove(sub_res.size()-1);
         }
    }
