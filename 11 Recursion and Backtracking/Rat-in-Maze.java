class Solution {
    static ArrayList<String> result= new ArrayList<String>();
    public static ArrayList<String> findPath(int[][] m, int n) {
        
        // TimeComplexity : o(4^(m*n))
        // Space Complexity :o(m*n)
        result.clear();
        if(m[0][0]==0)
        return result;
        boolean vis [][] = new boolean[n][n];
        StringBuilder path=new StringBuilder();
         findAllPaths(0,0,path,vis,m,n);
         return result;
        
    }
    public static void findAllPaths(int i,int j,StringBuilder path ,boolean vis[][],int [][] mat,int n)
    {
         if(i==n-1 && j==n-1)
         {
             StringBuilder sb= new StringBuilder(path);
             result.add(sb.toString());
             return;
         }
             vis[i][j]=true;
             if(i-1>-1 && !vis[i-1][j] && mat[i-1][j]==1)
             {
                 path.append('U');
                 findAllPaths(i-1,j,path,vis,mat,n);
                 path.deleteCharAt(path.length()-1);
             }
             if(i+1<n && !vis[i+1][j] && mat[i+1][j]==1)
             {
                 path.append('D');
                 findAllPaths(i+1,j,path,vis,mat,n);
                 path.deleteCharAt(path.length()-1);
             }
             if(j+1<n && !vis[i][j+1] && mat[i][j+1]==1)
             {
                 path.append('R');
                 findAllPaths(i,j+1,path,vis,mat,n);
                 path.deleteCharAt(path.length()-1);
             }
             if(j-1>-1 && !vis[i][j-1] && mat[i][j-1]==1)
             {
                 path.append('L');
                 findAllPaths(i,j-1,path,vis,mat,n);
                 path.deleteCharAt(path.length()-1);
             }
         
          vis[i][j]=false;
         
    }
}
