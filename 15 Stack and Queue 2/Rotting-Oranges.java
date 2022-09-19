class Solution {
    static int dx[]={-1,0,0,1};
    static int dy[]={0,-1,1,0};
    public int orangesRotting(int[][] grid) {
        // Time Compelxity : o(3*n*m)
        // Space Compleixty : o(2*n*m)
         int rowSize=grid.length,colSize=grid[0].length;
        Queue<Node> q =new LinkedList<Node>();
        boolean vis[][]=new boolean[rowSize][colSize];
        int timer=0;
        boolean b=false;
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
                 if(grid[i][j]==2)
                 {
                     vis[i][j]=true;
                     Node nm =new Node(i,j);
                     q.add(nm);
                 }
                 if(grid[i][j]==1)
                     b=true;
            }
        }
        if(q.isEmpty())
        {
            if(b)
                return -1;
            return 0;
        }
       
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node front=q.poll();
                for(int k=0;k<4;k++)
                {
                     int new_r=front.r+dx[k],new_c=front.c+dy[k];
                     if(check(new_r,new_c,rowSize,colSize) && !vis[new_r][new_c]&& grid[new_r][new_c]==1)
                     {
                         vis[new_r][new_c]=true;
                         Node nm=new Node(new_r,new_c);
                          q.add(nm);
                     }
                }
                
            }
            timer++;
        }
        for(int i=0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
                if(grid[i][j]==1 && !vis[i][j])
                    return -1;
            }
        }
        return timer-1;
    }
    public static boolean check(int x,int y,int n,int m)
    {
         if(x>-1 && y>-1 && x<n && y<m)
             return true;
        return false;
    }
}
class Node 
{
    int r,c;
    Node(int r,int c)
    {
         this.r=r;
        this.c=c;
    }
}
