
public class Stack {
    // Time Complexity : o(1)
   // Space  Complexity :o(n)
    int size=-1,top=-1;
    int [] arr;
    Stack(int size)
    {
        this.size=size;
        arr=new int[size];
     
    }
    void push(int num) {
        // Write your code here.
        if(top==size)
            return;
        arr[++top]=num;
    }
    int pop() {
        // Write your code here.
        if(top==-1)
            return -1;
         int ele=arr[top--];
        
        return ele;
    }
    int top() {
        // Write your code here.
        if(top==-1)
           return -1;
        return arr[top];
    }
    int isEmpty() {
        // Write your code here.
        if(top==-1)
            return 1;
        return 0;
    }
    int isFull() {
        // Write your code here.
        if(top==size)
            return 1;
        return 0;
    }
}
