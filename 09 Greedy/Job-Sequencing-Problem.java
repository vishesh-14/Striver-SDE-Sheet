class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Time Complexity : o(nlong+n*m)
        // Sapce Complexity : o(m)
         int ma=1;
         for(int i=0;i<n;i++)
         ma=Math.max(ma,arr[i].deadline);
         Arrays.sort(arr,new mycomp());
          boolean b[]= new boolean[ma+1];
         int count=0,maxi=0;
         for(int i=0;i<n;i++)
         {
             int dead=arr[i].deadline;
             while(dead>0 && b[dead]==true)
              dead--;
              if(dead>0)
              {
                   count++;
                   maxi+=arr[i].profit;
                   b[dead]=true;
              }
         }
         int []res = new int[2];
         res[0]=count;
         res[1]=maxi;
         return res;
    }
}
class mycomp implements Comparator<Job>
{
     public int compare(Job obj1,Job obj2)
     {
          if(obj1.profit!=obj2.profit)
          return obj2.profit-obj1.profit;
          return obj2.deadline-obj1.deadline;
     }
}
