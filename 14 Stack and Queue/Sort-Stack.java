public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        // Time Compleixty :o(n^2)
        // Space Compleixty : o(n)
             sort(stack);
	}
   public static void sort(Stack<Integer> stack)
   {
        if(stack.isEmpty())
            return ;
        int ele=stack.peek();
         stack.pop();
          sort(stack);
         addElement(stack,ele);
   }
    public static void addElement(Stack<Integer> stack,int no)
    {
         if(stack.isEmpty() || no>=stack.peek())
         {
             stack.push(no);
             return;
         }
         int ele=stack.peek();
         stack.pop();
         addElement(stack,no);
          stack.push(ele);
        
    }
