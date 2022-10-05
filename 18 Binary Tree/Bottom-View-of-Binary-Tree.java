class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        TreeMap<Integer,Integer> map =new TreeMap<Integer,Integer>();
        Queue<Pair> q =new LinkedList<Pair>();
         Pair temp=new Pair(root,0);
         q.offer(temp);
         while(!q.isEmpty())
         {
              int size=q.size();
              for(int i=0;i<size;i++)
              {
                   Pair front=q.poll();
                   map.put(front.line,front.nm.data);
                    if(front.nm.left!=null)
                     q.offer(new Pair(front.nm.left,front.line-1));
                    if(front.nm.right!=null)
                    q.offer(new Pair(front.nm.right,front.line+1));
              }
         }
         ArrayList<Integer> result=new ArrayList<Integer>();
         for(Map.Entry it : map.entrySet())
         {
              result.add((int)it.getValue());
         }
         return result;
    }
    
}
class Pair
{
   Node nm;
   int line;
    Pair(Node nm,int line)
    {
         this.nm=nm;
         this.line=line;
    }
    
    
}
