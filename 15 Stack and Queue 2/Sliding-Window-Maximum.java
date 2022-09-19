public int[] maxSlidingWindow(int[] nums, int k) {
        // Time Complexity : o(2*n)
        // Space Complexity : o(k)
         int n=nums.length,idx=0;
        Deque<Integer> dq=new LinkedList<Integer>();
        int [] maximums=new int[n-k+1];
         for(int i=0;i<k;i++)
         {
             while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
                 dq.pollLast();
             dq.offerLast(i);
         }
        maximums[idx++]=nums[dq.peekFirst()];
        for(int i=k;i<n;i++)
        {
             while(!dq.isEmpty() && dq.peek()<=i-k)
                 dq.pollFirst();
              while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()])
                 dq.pollLast();
            dq.offerLast(i);
            maximums[idx++]=nums[dq.peekFirst()];
        }
        return maximums;
    }
