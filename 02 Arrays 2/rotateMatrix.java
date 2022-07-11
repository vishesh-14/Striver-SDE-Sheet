 public void rotate(int[][] matrix) {
        // TimeComplexity :o(n^2)
        // SpaceComplexity :o(1)
         int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<n;i++)
        {
            reverse(matrix,i,0,n-1);
        }
        
    }
    public static void reverse(int[][] matrix, int row,int i,int j)
    {
         while(i<j)
         {
              int temp=matrix[row][i];
             matrix[row][i]=matrix[row][j];
             matrix[row][j]=temp;
             i++;
             j--;
         }
        
    }
    
    public static void swap(int[][] matrix,int i,int j)
    {
         int temp=matrix[i][j];
        matrix[i][j]=matrix[j][i];
         matrix[j][i]=temp;
     }