import java.util.*;
import java.io.*;
class Solution {
    static   BufferedReader br = new   BufferedReader(new InputStreamReader(System.in));
    static Scanner obj = new Scanner(br);
    static StringBuilder out = new StringBuilder();
   
    public static void main(String args[]) {
     // Time Complexity : o(range)*n
     // Space Complexity : o(1)
        int t=obj.nextInt();
        while(t-->0)
        solve();
        System.out.println(out);
    }
    public static void solve()
    {
         int n=obj.nextInt(),cows=obj.nextInt();
           int [] a = new int[n];
           for(int i=0;i<n;i++)
           a[i]=obj.nextInt();
           Arrays.sort(a);
           int low=1,high=a[n-1]-a[0],ans=low;
           while(low<=high)
           {
               int mid=(low+high)/2;
                if(check(a,cows,mid))
                {
                    ans=mid;
                    low=mid+1;
                }
                else
                high=mid-1;
           }
        out.append(ans+"\n");
    }
    public static boolean check(int [] a,int cows,int mid)
    {
         int count=1,n=a.length,prevIdx=0;
         for(int i=1;i<n;i++)
         {
              if(a[i]-a[prevIdx]>=mid)
              {
                   count++;
                   prevIdx=i;
              }
             if(count==cows)
                 return true;
         }
         
          return false;
    }
    
   
}
