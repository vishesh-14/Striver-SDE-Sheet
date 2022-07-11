 public int[][] merge(int[][] intervals) {
         int n=intervals.length;
        Arrays.sort(intervals,new mycomp());
        int [][]res = new int[size][2];
          st.push(nm);
         for(int i=1;i<n;i++)
         {
             Node top=st.peek();
         
         
        if(top.first<=intervals[i][0] && top.second>=intervals[i][0])
              {
        
        nm = new Node(top.first,Math.max(intervals[i][1],top.second));
                  st.pop();
                 st.push(nm);
              }
             else
             {
                 nm = new Node(intervals[i][0],intervals[i][1]);
                 st.push(nm);
             }
          
         }
       
        return res;
    }
}
class Node
{
    int first,second;
    Node(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
class mycomp implements Comparator<int[]>
{
  public  int compare(int [] x1,int []y1)
  {
       if(x1[0]!=y1[0])
       return x1[0]-y1[0];
       return x1[1]-y1[1];
  }
}
