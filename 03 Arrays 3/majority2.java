public List<Integer> majorityElement(int[] nums) {
        // Time Complexity : o(n)+o(n)
        // Space Complexity : o(1)
      List<Integer> ans = new ArrayList<Integer>();
         int n=nums.length,num1=Integer.MIN_VALUE,num2=Integer.MIN_VALUE,c1=0,c2=0;
        for(int  x : nums)
        {
             if(x==num1) 
                 c1++;
            else if(x==num2)
                c2++;
            else if(c1==0)
            {
                num1=x;
                 c1++;
            }
            else if(c2==0)
            {
                num2=x;
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
         c1=0;c2=0;
        for(int x : nums)
        {
             if(x==num1)
                 c1++;
             if(x==num2)
                 c2++;
        }
        if(c1>(n/3))
             ans.add(num1);
        if(c2>(n/3))
            ans.add(num2);
        return ans;
    }
