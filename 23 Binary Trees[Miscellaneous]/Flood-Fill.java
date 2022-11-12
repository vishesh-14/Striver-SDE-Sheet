class Solution {
    static int dx[]={-1,0,0,1};
    static int dy[]={0,-1,1,0};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Time Complexity : o(n*m)
        // Space Complexity : o(n*m)
       boolean vis[][]=new boolean[image.length][image[0].length];
         fillMatrix(sr,sc,image[sr][sc],color,vis,image);
        return image;
    }
    public static void fillMatrix(int row,int col,int ele,int color,boolean [][] vis,int [][] image)
    {
        image[row][col]=color;
        vis[row][col]=true;
          for(int k=0;k<4;k++)
          {
               int new_row=row+dx[k],new_col=col+dy[k];
         if(check(new_row,new_col,image.length,image[0].length) && !vis[new_row][new_col] && image[new_row][new_col]==ele)
                {
                   
                     fillMatrix(new_row,new_col,ele,color,vis,image);
                }
          }
    }
    public static boolean check(int i,int j,int rowSize,int colSize)
    {
         if(i>=0 && j>=0 && i<rowSize && j<colSize)
         return true;
         return false;
    }
}
