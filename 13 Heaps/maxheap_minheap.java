// MinHeap
static int[] minHeap(int n, int[][] q) {
        // Write your code here.
         int [] heap =new int[n];
        ArrayList<Integer> popped=new ArrayList<Integer>();
        int p1=0,size=q.length;
        for(int i=0;i<size;i++)
        {
            if(q[i][0]==0)
            {
                heap[p1++]=q[i][1];
              percolateUp(heap,p1);
             }
            else
            {
                popped.add(heap[0]);
                 heap[0]=heap[p1-1];
                p1--;
                percolateDown(heap,p1);
            }
         }
        size=popped.size();
      int [] res =new int[size];
        for(int i=0;i<size;i++)
            res[i]=popped.get(i);
        return res;
    }
    public static void percolateDown(int [] heap,int n)
    {
        int p1=0;
        while(p1<n)
        {
             int minIndex=p1;
            if(2*p1+1<n && heap[minIndex]>heap[2*p1+1])
                minIndex=2*p1+1;
            if(2*p1+2<n && heap[minIndex]>heap[2*p1+2])
                minIndex=2*p1+2;
            if(minIndex==p1)
                return;
            swap(heap,minIndex,p1);
            p1=minIndex;
        }
    }
    public static void percolateUp(int [] heap,int n)
    {
         int p2=n-1;
        while(p2>0)
        {
            int par=(p2-1)/2;
             if(heap[par]<=heap[p2])
                return ;
            swap(heap,par,p2);
            p2=(p2-1)/2;
        }
    }
    public static void swap(int [] heap,int i,int j)
    {
         int temp=heap[i];
         heap[i]=heap[j];
        heap[j]=temp;
    }