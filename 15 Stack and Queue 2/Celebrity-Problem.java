int findCelebrity(int n) {
    // Time Complextiy :o(n)
    // Space Complexity : o(n)
 	stack<int> s;
    for(int i=0;i<n;i++)
        s.push(i);
    while(s.size()>1)
    {
        int top1=s.top();
         s.pop();
         int top2=s.top();
        s.pop();
        if(knows(top1,top2))
        s.push(top2);
        else
            s.push(top1);
        
    }
    for(int i=0;i<n;i++)
    { 
        if(i==s.top())
            continue;
         if(knows(s.top(),i)==true)
             return -1;
         if(knows(i,s.top())==false)
            return -1;
    }
            return s.top();
    
}
