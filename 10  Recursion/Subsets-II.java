vector<vector<int>> result;
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        // Time Complexity : o(2^N)
        // Space Complexity :o(2^N*k)

        result.clear();
         int n=nums.size();
        vector<int> sub_res;
        sort(nums.begin(),nums.end());
         generateSubsets(0,sub_res,nums);
         
        return result;
    }
void generateSubsets(int idx,vector<int> &subsets,vector<int>&nums)
     {
          result.push_back(subsets);
         for(int i=idx;i<nums.size();i++)
         {
              if(i!=idx && nums[i]==nums[i-1])
                  continue;
               subsets.push_back(nums[i]);
              generateSubsets(i+1,subsets,nums);
             subsets.pop_back();
         }
     }
