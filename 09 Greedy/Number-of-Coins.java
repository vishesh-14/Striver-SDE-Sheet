	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Time Complexity : o(M*V)
	    // Space Complexity : o(M*V)
	    long [][] dp =new long[M][V+1];
	    for(long x[] : dp)
	    Arrays.fill(x,-1);
	    long res=find(M-1,coins,V,dp);
	     if(res>=Integer.MAX_VALUE)
	     return -1;
	     return (int)res;
	} 
	public static long  find(int idx,int [] coins,int tar,long [][] dp)
	{
	      if(tar==0)
	      return 0;
	       if(idx<0)
	       return Integer.MAX_VALUE;
	        if(dp[idx][tar]!=-1)
	        return dp[idx][tar];
	     long notPick=find(idx-1,coins,tar,dp);
	     long pick=Integer.MAX_VALUE;
	      if(tar>=coins[idx])
	      pick=1+find(idx,coins,tar-coins[idx],dp);
	      return dp[idx][tar]=Math.min(pick,notPick);
	}
