public boolean searchMatrix(int[][] matrix, int target) {
        // Time Complexity :o(n+m)
        // Space Complexity : o(1)
         int n=matrix.length,m=matrix[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0)
        {
            if(matrix[i][j]==target)
                return true;
             if(target>matrix[i][j])
                  i++;
            else 
                j--;
            
        }
        return false;
    }