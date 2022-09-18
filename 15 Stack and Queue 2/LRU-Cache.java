class Node 
{
    int key,value;
     Node next,prev;
     Node(int key,int value)
     {
       this.key=key;
       this.value=value;
       this.prev=this.next=null;
     }
}
class DoubleLL
{
    static  Node head=new Node(-1,-1);
    static Node tail=new Node(-1,-1);
    DoubleLL()
    {
        head.next=tail;
        tail.prev=head;
    }
      public Node add(int key,int value)
      {
          Node nm =new Node(key,value);
          Node prevNode=tail.prev;
           nm.next=tail;
          tail.prev=nm;
           prevNode.next=nm;
          nm.prev=prevNode;
          return nm;
          
      }
    public void remove()
    {
        head.next=head.next.next;
         head.next.prev=head;
        
    }
    public  void removeLast(Node nm)
    {
         nm.next.prev=nm.prev;
        nm.prev.next=nm.next;
        Node prevNode=tail.prev;
         nm.next=tail;
        tail.prev=nm;
         prevNode.next=nm;
          nm.prev=prevNode;
    }
   
    
}
class LRUCache {
    HashMap<Integer,Node> hm =new HashMap<Integer,Node>();
    DoubleLL obj=new DoubleLL();
  // Time Complexity : o(1)
  // Space Complexity: o(1)
  int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
      
         if(hm.containsKey(key)==false)
             return -1;
        
        Node nm=hm.get(key);
        obj.removeLast(nm);
        
       
        return nm.value;
        
    }
    
    public void put(int key, int value) {
        if(hm.size()==capacity && hm.containsKey(key)==false)
        {
          
           
            hm.remove(obj.head.next.key);
            obj.remove();
        }
       
         if(hm.containsKey(key)==false)
         {
             Node nm=obj.add(key,value);
             hm.put(key,nm);
             
         }
        else
        {
            Node nm=hm.get(key);
            nm.value=value;
             obj.removeLast(nm);
            
        }
        
            
    }
}
