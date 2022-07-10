 public List<Integer> getRow(int rowIndex) {
        List<Integer> pascal = new ArrayList<Integer>();
        long res=1;
        pascal.add(1);
        for(int i=0;i<rowIndex;i++)
        {
             res=res*(rowIndex-i);
            res=res/(i+1);
            pascal.add((int)res);
        }
        return pascal;
    }