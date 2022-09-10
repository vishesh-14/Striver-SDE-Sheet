class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Time Complexity :o(nlogn)
        // Space Complexity :o(n)
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        for(int  x : nums)
        {
            h.put(x,h.getOrDefault(x,0)+1);
        }
       TreeSet<node> t = new TreeSet<node>();
        for(Map.Entry it : h.entrySet())
        {
             node nm = new node((int)it.getKey(),(int)it.getValue());
            t.add(nm);
        }
       Iterator it =t.iterator();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(it.hasNext() && k-->0)
        {
            node top=(node)it.next();
              ans.add(top.f);
         
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
class node implements Comparable<node> 
{
   int f,s;
    node(int f,int s )
    {
     this.f=f;
     this.s=s;
    }
    public int compareTo(node obj)
    {
        if(this.s>=obj.s)
        return -1;
        return 1;
    }
}
