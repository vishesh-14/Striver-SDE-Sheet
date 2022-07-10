 public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        int [][] mat = new int[numRows][];
        for(int i=0;i<numRows;i++)
            mat[i]= new int[i+1];
          mat[0][0]=1;
        for(int i=1;i<numRows;i++)
        {
            mat[i][0]=1;
            int col=mat[i].length;
            for(int j=1;j<col-1;j++)
            {
                mat[i][j]=mat[i-1][j-1]+mat[i-1][j];
            }
            mat[i][col-1]=1;
        
        }
        for(int i=0;i<numRows;i++)
        {
            pascal.add(new ArrayList<Integer>());
             for(int j=0;j<mat[i].length;j++)
                 pascal.get(i).add(mat[i][j]);
        }
    
        return pascal;
    }