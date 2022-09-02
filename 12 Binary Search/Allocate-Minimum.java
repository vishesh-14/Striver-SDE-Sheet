public int books(int[] A, int B) {
        
        // Time Complexity : o(log(range)*n)
        // Space Complexity : o(1)
        
        int low=A[0],high=A[0],n=A.length;
        if(B>n)// important condition to write 
        return -1;
        for(int i=1;i<n;i++)
        {
            low=Math.min(low,A[i]);
            high+=A[i];
        }
        int ans=-1;
        while(low<=high)
        {
             int mid=(low+high)/2;
              if(check(A,B,mid))
              {
                   ans=mid;
                    high=mid-1;
              }
              else
              low=mid+1;
        }
        return ans;
    }
    public static boolean check(int [] a,int k,int mid)
    {
         int n=a.length,count=1,sum=0;
         for(int i=0;i<n;i++)
         {
              sum=sum+a[i];
              if(a[i]>mid) // important condition to write 
               return false;
               if(sum>mid)
               {
                   count++;
                   sum=a[i];
               }
         }
         if(count<=k)
          return true;
          return false;
    }
