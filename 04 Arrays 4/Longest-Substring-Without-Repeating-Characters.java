public int lengthOfLongestSubstring(String s) {
        // Time Complexity : o(n+n)
        // Space Complexity : o(n)
         int n=s.length();
         HashSet<Character> hs = new HashSet<Character>();
        int p1=0, res=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
             if(hs.contains(ch))
             {
                 res=Math.max(res,i-p1);
                  while(s.charAt(p1)!=ch)
                  {
                      hs.remove(s.charAt(p1));
                      p1++;
                  }
                 p1++;
             }
            hs.add(ch);
        }
         res=Math.max(res,n-p1);
        return res;
    }
