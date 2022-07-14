 public int uniquePaths(int n, int m) {
        // Time Complexity  o(m+n-2)
        // Space complexity o(1)
        double   res=1;
        int mi=Math.min(n,m),ma=Math.max(n,m);
        for(int i=ma;i<=m+n-2;i++)
            res=res*i;
         for(int i=2;i<mi;i++)
             res=res/i;
        return (int)res;
    }
