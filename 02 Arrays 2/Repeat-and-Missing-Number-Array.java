public int[] repeatedNumber(final int[] A) {
        // Time Complexity : o(n+n+n+n)
        // Space Complexity :o(1)
        int n=A.length;
        int xor=0;
        for(int i=0;i<n;i++)
         xor^=A[i];
        for(int i=1;i<=n;i++)
        xor^=i;
        int set=0,notSet=0;
        xor=xor &~(xor-1);
        for(int i=0;i<n;i++)
        {
              if((xor&A[i])!=0)
              set^=A[i];
              else
              notSet^=A[i];
        }   
        for(int i=1;i<=n;i++)
        {
             if((xor&i)!=0)
             set^=i;
             else
             notSet^=i;
        }
        int [] res = new int[2];
        for(int i=0;i<n;i++)
        {
             if(A[i]==set)
             {
                 res[0]=set;
                 res[1]=notSet;
                 break;
             }
             if(A[i]==notSet)
             {
                 res[0]=notSet;
                 res[1]=set;
                 break;
             }
        }
        return res;
        
        
    }
