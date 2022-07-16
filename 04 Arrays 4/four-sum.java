 public List<List<Integer>> fourSum(int[] nums, int target) {
      // Time Complexity : o(nlogn+n^3)
      // Space Complexity : o(1)
        int n=nums.length;
        List<List<Integer>> res= new ArrayList<>();
         Arrays.sort(nums);
       
        
        for(int i=0;i<n-3;i++)
        {
            
            for(int j=i+1;j<n-2;j++)
            {
               
                 int p1=j+1,p2=n-1;
               long  sub_tar=target-(nums[i]+nums[j])-0L;
             
                while(p1<p2)
                {
                  long  cur_sum=nums[p1]+nums[p2];
                 
                     if(cur_sum==sub_tar)
                     {
                 ArrayList<Integer> indices= new ArrayList<Integer>();
                         indices.add(nums[i]);
                         indices.add(nums[j]);
                         indices.add(nums[p1]);
                         indices.add(nums[p2]);
                       res.add(indices);  
                         while(i+1<n-3 && nums[i]==nums[i+1])
                              i++;
                           while(j+1<n-2 && nums[j]==nums[j+1])
                               j++;
                            while(p1+1<n-1 && nums[p1]==nums[p1+1])
                                p1++;
                          while(p2>0 && nums[p2]==nums[p2-1])
                              p2--;
                        
                     }
                    
                    if(sub_tar>cur_sum)
                        p1++;
                    else 
                        p2--;
                }
            }
        }
        return res;
    }
