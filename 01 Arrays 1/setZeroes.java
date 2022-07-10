 public void setZeroes(int[][] matrix) {
         //----------------------------------------//
        // Time Complexity : o(n^2)
        // Space Complexity :o(n+m)
        // Better Approach//
        int n=matrix.length,m=matrix[0].length;
       
        boolean [] row = new boolean[n];
        boolean [] col = new boolean[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                
                    col[j]=true;
                }
            }
        }
       for(int i=0;i<n;i++)
       {
            if(row[i])
            {
                
                    for(int k=0;k<m;k++)
                        matrix[i][k]=0;
               
            
            }
       }
        for(int i=0;i<m;i++)
        {
             if(col[i])
             {
                 
                     for(int k=0;k<n;k++)
                        matrix[k][i]=0;
             }
        }
        
        
        
        
        
        
        
        //------------------------------------------------//
        // Final Approach 
        // Time Complexity : o(n^2)
        // Space Complexity :o(1)
        int n=matrix.length,m=matrix[0].length;
        int col=1;
      
        for(int i=0;i<n;i++)
        {
            if(matrix[i][0]==0)
                col=0;
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=1;j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
          if(col==0)
            matrix[i][0]=0;
        }
       
     
    }
