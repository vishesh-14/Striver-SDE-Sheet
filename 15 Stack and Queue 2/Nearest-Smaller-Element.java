 public int[] prevSmaller(int[] A) {
        // Time Complexity : o(n+n)
        // Space Complexity : o(n)
        ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
        int n=A.length;
        int [] prevSmall=new int[n];
        for(int i=0;i<n;i++)
        {
             while(!stack.isEmpty() && stack.peek()>=A[i])
             {
                  stack.pop();
             }
             if(stack.isEmpty())
             {
                 prevSmall[i]=-1;
             }
             else
             prevSmall[i]=stack.peek();
             stack.push(A[i]);
        }
        return prevSmall;
    }