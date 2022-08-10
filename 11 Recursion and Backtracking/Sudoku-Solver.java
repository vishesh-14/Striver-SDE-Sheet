class Solution {
    public void solveSudoku(char[][] board) {
        // Time Complexity :o(9^(n^2))
        // Space Complexity : o(1)
          fillSudoku(board);
    }
    public boolean fillSudoku(char [][] board)
    {
         for(int i=0;i<9;i++)
         {
             for(int j=0;j<9;j++)
             {
                 if(board[i][j]=='.')
                 {
                      for(int k=49;k<=57;k++)
                      {
                          if(isSafe(i,j,(char)k,board))
                          {
                              board[i][j]=(char)k;
                              if(fillSudoku(board))
                                  return true;
                               else
                                   board[i][j]='.';
                             
                          }
                          
                          
                      }
                     return false;
                    
                 }
             }
         }
        return true;
    }
    public static boolean isSafe(int row,int col,char val,char [][] board)
    {
        
         for(int i=0;i<9;i++)
         {
              if(board[row][i]==val)
                  return false;
        
             if(board[i][col]==val)
                 return false;
             if(board[3*(row/3)+i/3][3*(col/3)+i%3]==val)
                 return false;
        }
        
        return true;
    }
    
}
