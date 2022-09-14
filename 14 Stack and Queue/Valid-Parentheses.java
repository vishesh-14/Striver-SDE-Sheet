 public boolean isValid(String s) {
        // Time Complexity : o(n)
        // Space Complexity :o(n)
        ArrayDeque<Character> stack =new ArrayDeque<Character>();
      int n=s.length();
        for(int i=0;i<n;i++)
        {
             char ch=s.charAt(i);
             if(ch=='(' || ch=='{' || ch=='[')
                 stack.push(ch);
            else if(!stack.isEmpty() &&  check(ch,stack))
            {
                 stack.pop();
            }
            else
                return false;
        }
        return stack.isEmpty();
            
    }
    public static boolean check(char ch,ArrayDeque<Character> stack)
    {
         if(ch==')' && stack.peek()=='(')
             return true;
         if(ch=='}' && stack.peek()=='{')
             return true;
        if(ch==']' && stack.peek()=='[')
            return true;
        return false;
    }
