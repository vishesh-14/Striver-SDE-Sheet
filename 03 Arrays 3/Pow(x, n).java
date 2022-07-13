public double myPow(double x, int n1) {
        // Time Complexity : o(set bits of n)
        // Space Complexity : o(1)
        boolean b=false;
        long n=n1;
         if(n<0)
         {
             n=n*-1;
             b=true;
         }
       double ans=1.0;
         while(n>0)
         {
              if((n&1)!=0)
                  ans=ans*x;
             n>>=1;
             x=x*x;
         }
        if(b)
            return 1/ans;
        return ans;
         
    }
