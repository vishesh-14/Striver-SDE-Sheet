class MyQueue {
ArrayDeque<Integer> s1=new ArrayDeque<Integer>();
ArrayDeque<Integer> s2=new ArrayDeque<Integer>();
// Time Compleixty : o(n)
// Space Complexity : o(n)
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty())
        {
           while(!s1.isEmpty())
            s2.push(s1.pop());
        }
        int top=s2.peek();
         s2.pop();
        return top;
        
    }
    
    public int peek() {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            s2.push(s1.pop());
        }
        return s2.peek();
        
    }
    
    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty())
            return true;
        return false;
    }
}
