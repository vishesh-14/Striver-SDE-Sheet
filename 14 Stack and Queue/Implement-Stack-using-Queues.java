class MyStack {
static Queue<Integer> q=new LinkedList<Integer>();
// Time Complexity : o(n)
// Space Complexity : o(n)
    public MyStack() {
      q.clear();
       
    }
    
    public void push(int x) {
         int size=q.size();
        q.add(x);
        for(int i=0;i<size;i++)
        {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        
        return q.peek();
    }
    
    public boolean empty() {
         return q.isEmpty();
    }
}
