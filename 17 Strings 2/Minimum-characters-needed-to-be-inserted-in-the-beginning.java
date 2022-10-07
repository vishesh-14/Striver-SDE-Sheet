public class Solution {
    static  int  mod=(int)1e9+7;
    static long p=93;
    public int solve(String A) {
      // Time Complexity : o(n)
      // Space Complexity : o(n)
        int n=A.length();
        long [] pre = new long[n];
        long [] suff= new long [n];
        long [] pow = new long[n+1];
        pow[0]=1;
        for(int i=1;i<=n;i++)
        {
            pow[i]=(pow[i-1]*p)%mod;
        }
        pre[0]=((int)A.charAt(0)*pow[1])%mod;
        for(int i=1;i<n;i++)
        {
            pre[i]=(pre[i-1]+((int)A.charAt(i)*pow[i+1]))%mod;
        }
        suff[n-1]=((int)A.charAt(n-1)*pow[1])%mod;
        for(int i=n-2;i>=0;i--)
        {
            suff[i]=(suff[i+1]+((int)A.charAt(i)*pow[n-i]))%mod;
        }
        //System.out.println(pre[n-1] +" "+suff[0]);
        if(pre[n-1]==suff[0])
        return 0;
        System.out.println(A.length());
        for(int i=n-2;i>=0;i--)
        {
            if(check(pre,suff,pow,i,n))
            {
                System.out.println(i);
                return n-1-i;
            }
        }
        return -1;

    }
    public static boolean check(long [] pre, long [] suff,long pow[],int i,int n)
    {
       // System.out.println(i);
         long ha=(pre[i]*(pow[n-i-1]))%mod;
         long hb=(suff[0]-suff[i+1]+mod)%mod;
         //System.out.println(ha+" "+hb);
         return ha==hb; 
    }
}
