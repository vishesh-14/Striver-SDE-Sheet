
import java.util.*;
public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
    // Time Complexity : o(nlogn)
    // Space Complexity : o(n)
        PriorityQueue<Node> pq=new PriorityQueue<Node>();
        int size=kArrays.size();
        Node nm=null;
        for(int i=0;i<size;i++)
        {
            nm=new Node(kArrays.get(i).get(0),i,0);
            pq.add(nm);
        }
        ArrayList<Integer> sorted=new ArrayList<Integer>();
        while(!pq.isEmpty())
        {
            Node top=pq.poll();
            sorted.add(top.val);
             if(top.ind2==kArrays.get(top.ind1).size()-1)
                 continue;
      top.val=kArrays.get(top.ind1).get(top.ind2+1);
         top.ind2+=1;
            pq.add(top);
        }
        return sorted;
	}
}
class Node implements Comparable<Node>
{
    int val,ind1,ind2;
    Node(int val,int ind1,int ind2)
    {
        this.val=val;
        this.ind1=ind1;
        this.ind2=ind2;
    }
    public int compareTo(Node obj)
    {
         if(this.val!=obj.val)
         return this.val-obj.val;
         return -1;
    }
}
