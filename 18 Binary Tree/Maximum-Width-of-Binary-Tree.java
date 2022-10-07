class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        // Time Complexity: o(n)
        // Space Complexity :o(n)
        int maxWidth=0;
        Queue<Pair> q=new LinkedList<Pair>();
         q.add(new Pair(root,0));
         while(!q.isEmpty())
         {
              int size=q.size(),first=-1,last=-1;
              for(int i=0;i<size;i++)
              {
                   Pair front=q.poll();
                   if(i==0)
                      first=front.idx;
                   if(i==size-1)
                       last=front.idx;
                   if(front.node.left!=null)
                       q.add(new Pair(front.node.left,front.idx*2+1));
                   if(front.node.right!=null)
                       q.add(new Pair(front.node.right,front.idx*2+2));
              }
             maxWidth=Math.max(maxWidth,last-first+1);
         }
        return maxWidth;
    }
}
class Pair
{
    TreeNode node;
     int idx;
     Pair(TreeNode node,int idx)
     {
          this.node=node;
         this.idx=idx;
     }
}
