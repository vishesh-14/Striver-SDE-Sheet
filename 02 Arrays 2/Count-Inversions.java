  public static long getInversions(long arr[], int n) {
        // Time Complexity : o(nlogn)
        // Space Complexity :o(n)
        return mergeSort(arr,0,n-1);
    }
    public static long mergeSort(long arr[],int low,int high)
    {
         if(low==high)
             return 0;
           int mid=(low+high)/2;
        long left=mergeSort(arr,low,mid);
        long right=mergeSort(arr,mid+1,high);
        
        return left+right+merge(arr,low,mid,high);
    }
    public static long merge(long arr[],int low,int mid,int high)
    {
          long [] temp=new long[high-low+1];
        long count=0;
         int p1=low,p2=mid+1,p3=0;
        while(p1<=mid && p2<=high)
        {
              if(arr[p1]<=arr[p2])
                  temp[p3++]=arr[p1++];
            else
            {
                count=count+mid-p1+1;
                 temp[p3++]=arr[p2++];
            }
        }
        while(p1<=mid)
            temp[p3++]=arr[p1++];
        while(p2<=high)
            temp[p3++]=arr[p2++];
        for(int i=0;i<temp.length;i++)
            arr[i+low]=temp[i];
        return count;
    }
