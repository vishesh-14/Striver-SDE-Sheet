class Node
{
     int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class SingleLinkedList
{
   
    Node firstNode=null,lastNode=null;
    public void addElement(int num)
    {
        Node nm=new Node(num);
        if(firstNode==null)
        {
           
            firstNode=lastNode=nm;
            return;
        }
        lastNode.next=nm;
        lastNode=nm;
    }
    public int  removeElement()
    {
        if(firstNode==null)
            return -1;
        int val=firstNode.data;
      
        firstNode=firstNode.next;
        return val;
    }
}
public class Queue {
static SingleLinkedList myQueue=null;
    // Time Complexity : o(1)
    // Space Complexity : o(n)
    Queue() {
        // Implement the Constructor
        myQueue=new SingleLinkedList();
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if(myQueue.firstNode==null)
            return true;
        return false;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        myQueue.addElement(data);
    }

    int dequeue() {
        // Implement the dequeue() function
        return myQueue.removeElement();
    }

    int front() {
        // Implement the front() function
        if(isEmpty())
            return -1;
        return myQueue.firstNode.data;
    }

}
