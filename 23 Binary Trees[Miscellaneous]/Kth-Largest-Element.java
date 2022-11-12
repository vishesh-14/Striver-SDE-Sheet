class KthLargest {
 PriorityQueue<Integer> pq;
 int size=-1;
 // Time Complexity : o(klogk)
 // Space Complexity  : o(k)
    public KthLargest(int k, int[] nums) {
        size=k;
        pq=new PriorityQueue<>(size);
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
             pq.add(nums[i]);
              if(pq.size()>size)
              {
                  pq.poll();
              }
        }

    }
    
    public int add(int val) {
          pq.add(val);
          if(pq.size()>size)
           pq.poll();
           return (int)pq.peek();
    }
}
