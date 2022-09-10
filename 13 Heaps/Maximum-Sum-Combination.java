
    public class Solution {
    public int[] solve(int[] A, int[] B, int C) {
        // Time Compleixty : o(nlogn)
    // Space Complexity : o(n)
       Arrays.sort(A);
       Arrays.sort(B);
      PriorityQueue<Node> pq =new PriorityQueue<Node>(new mycomp());
       int n=A.length;
       Node nm=null;
       for(int i=0;i<n;i++)
       {
         nm =new Node(A[i]+B[n-1],i,n-1);
         pq.add(nm);
         
        }
         int [] res=new int[C];
         int k=0;
         while(!pq.isEmpty() && k<C)
         {
             Node top=pq.poll();
             res[k++]=top.sum;
             if(top.p2==0)
             continue;
            
                nm=new Node(A[top.p1]+B[top.p2-1],top.p1,top.p2-1);
                pq.add(nm);
            
             
            
        }
    return res;
}
}

class Node 
{
     int sum,p1,p2;
     Node(int sum,int p1,int p2)
     {
         this.sum=sum;
         this.p1=p1;
         this.p2=p2;
     }
}
class mycomp implements Comparator<Node>
{
     public int compare(Node obj1,Node obj2)
     {
          if(obj1.sum!=obj2.sum)
          return obj2.sum-obj1.sum;
         
          return -1;
     }
}
