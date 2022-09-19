class MinStack {
 ArrayDeque<Integer> stack1=new ArrayDeque<Integer>();
 ArrayDeque<Integer> stack2=new ArrayDeque<Integer>();
    public MinStack() {
        
    }
    
    public void push(int val) {
       
        
        stack1.push(val);
        if(stack2.isEmpty() || stack2.peek()>=val)
            stack2.push(val);
        
    }
    
    public void pop() {
        int top=stack1.pop();
         if(top==stack2.peek())
             stack2.pop();
        
    }
    
    public int top() {
        
        return stack1.peek();
        
    }
    
    public int getMin() {
        return stack2.peek();
    }
}
