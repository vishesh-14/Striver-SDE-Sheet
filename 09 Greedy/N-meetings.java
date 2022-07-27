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
