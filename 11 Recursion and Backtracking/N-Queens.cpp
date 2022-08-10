class Solution {
public:
    vector<vector<string>> result;
    vector<vector<string>> solveNQueens(int n) {
        // Time Complexity : o(n!*n)
        // Space Complexity : o(n*n+k*n)
          result.clear();
       vector<vector<char>> mat(n,vector<char>(n,'.'));
        findAllPossible(0,mat,n);
        return result;
    }
    void findAllPossible(int idx,vector<vector<char>> &mat,int n)
    {
         if(idx==n)
         {
              addAnswer(mat,n);
             return;
         }
         for(int i=0;i<n;i++)
         {
            
              if(isSafe(i,idx,mat))
              {
                    mat[i][idx]='Q';
                  findAllPossible(idx+1,mat,n);
                    mat[i][idx]='.';
              }
           
         }
    }
     bool isSafe(int row,int col,vector<vector<char>> &mat)
     {
         int n=mat.size();
          for(int i=0;i<n;i++)
          {
               if(mat[row][i]=='Q')
                   return false;

                if(mat[i][col]=='Q')
                    return false;
          }
          int p1=row-1,p2=col-1;
          while(p1>-1 && p2>-1)
          {
              if(mat[p1][p2]=='Q')
                  return false;
              p1--;
              p2--;
          }
         p1=row+1;
         p2=col-1;
          while(p1<n && p2>-1)
          {
               if(mat[p1][p2]=='Q')
                   return false;
              p1++;
              p2--;
          }
         return true;
         
        
        
     }
    void addAnswer(vector<vector<char>> & mat,int n)
    {
         string s="";
        
        vector<string> sub_res;
        for(int i=0;i<n;i++)
        {
            s="";
            for(int j=0;j<n;j++)
            {
                s=s+mat[i][j];
            }
            sub_res.push_back(s);
        }
        result.push_back(sub_res);
    }
};
