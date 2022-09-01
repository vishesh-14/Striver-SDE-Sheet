 public int findMedian(int[][] A) {
        int low=Integer.MAX_VALUE,high=Integer.MAX_VALUE;
         int n=A.length,m=A[0].length;
         for(int i=0;i<n;i++)
         {
             low=Math.min(low,A[i][0]);
              high=Math.max(high,A[i][m-1]);
         }
         int ans=low,required=(n*m+1)/2;
         while(low<=high)
         {
              int mid=(low+high)/2;
               int  smallerNumbers=findFloor(mid,A);
                if(smallerNumbers<required)
                {
                    low=mid+1;
                }
                else
                {
                    ans=mid;
                    high=mid-1;
                }
         }
         return ans;
    }
    public static int findFloor(int mid,int [][] mat)
    {
        int count=0,n=mat.length,m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            count=count+doBs(0,m-1,mat[i],mid);
        }
        return count;
    }
   public static int doBs(int low,int high,int [] a,int target)
   {
       int  idx=-1;
        while(low<=high)
        {
             int mid=(low+high)/2;
              if(a[mid]>target)
                high=mid-1;
                else
                {
                    idx=mid;
                    low=mid+1;
                }
        }
        return idx+1;
   }
