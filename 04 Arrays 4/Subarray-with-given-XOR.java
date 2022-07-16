 public int solve(int[] A, int B) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int ans=0,n=A.length,pre=0;
        for(int i=0;i<n;i++)
        {
            pre^=A[i];
             if(pre==B)
             ans++;
             if(h.containsKey(pre^B))
              {
                  ans+=h.get(pre^B);
                  
              }
              
              h.put(pre,h.getOrDefault(pre,0)+1);
        }
        return ans;
    }
