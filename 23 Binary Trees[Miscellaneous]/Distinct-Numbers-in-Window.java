public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
       // Time Complexity : o(n)
       // Space Complexity : o(n)
       
        ArrayList<Integer> result=new ArrayList<>();
       if(B>A.size())
       return result;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
         for(int i=0;i<B;i++)
         {
             map.put(A.get(i),map.getOrDefault(A.get(i),0)+1);
         }
         result.add(map.size());
          int size=A.size();
         for(int i=B;i<size;i++)
         {
             int frontEle=A.get(i-B),currEle=A.get(i);
             int val=map.get(frontEle);
              if(val==1)
              map.remove(frontEle);
              else
              map.put(frontEle,val-1);
              map.put(currEle,map.getOrDefault(currEle,0)+1);
              result.add(map.size());
         }
         return result;
    }
