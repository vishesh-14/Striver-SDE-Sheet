class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // Time Complexity : o(nlogn+n)
        // Space Complexity : o(n)
        TreeSet<Node> ts = new TreeSet<Node>();
         for(int i=0;i<n;i++)
         {
             Node nm = new Node(start[i],end[i]);
              ts.add(nm);
         }
         Iterator it=ts.iterator();
          int count=1;
           
           Node k=(Node)it.next();
           int prevStart=k.f,prevEnd=k.s;
           while(it.hasNext())
           {
               k=(Node)it.next();
                if(k.f>prevEnd)
                {
                    count++;
                    prevStart=k.f;
                    prevEnd=k.s;
                    
                }
           }
           return count;
    }
}
class Node implements Comparable<Node>
{
    int f,s;
    Node(int f,int s)
    {
         this.f=f;
         this.s=s;
    }
    public  int compareTo(Node obj)
    {
         if(this.s!=obj.s)
         return this.s-obj.s;
         return this.f-obj.f;
    }
}
class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr,new mycomp());
         double maxAmount=0;
         for(int i=0;i<n;i++)
         {
              if(W>=arr[i].weight)
              {
                  maxAmount+=arr[i].value;
                  W-=arr[i].weight;
              }
              else 
              {
                   double ratio=(arr[i].value)/(double)arr[i].weight;
                   maxAmount+=ratio*W;
                   break;
              }
         }
         return maxAmount;
    }
}
class mycomp implements Comparator<Item>
{
     public int compare(Item i1, Item i2)
     {
         double ratio1=(i1.value)/(double)i1.weight;
         double ratio2=(i2.value)/(double)i2.weight;
         return (int)(ratio2-ratio1);
     }
}