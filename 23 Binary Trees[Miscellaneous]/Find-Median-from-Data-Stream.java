class MedianFinder {
  // Time Complexity : O(NlogN)
  // Space Complexity : O(N)
  PriorityQueue<Integer> minHeap=new PriorityQueue<>();
  PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0 || maxHeap.peek()>=num)
        maxHeap.add(num);
        else
         minHeap.add(num);
       int size1=maxHeap.size(),size2=minHeap.size();
         if(size1-size2>1)
         {
             int ele=(int)maxHeap.poll();
              minHeap.add(ele);
         }
         else if(size2>size1)
         {
             int ele=(int)minHeap.poll();
              maxHeap.add(ele);
         }
           

    }
    
    public double findMedian() {
         int size1=maxHeap.size(),size2=minHeap.size();
           double median=0;
          if((size1+size2)%2==0)
           median=(maxHeap.peek()+minHeap.peek())/2.0;
           else
           median=maxHeap.peek();
           return median;
    }
}
