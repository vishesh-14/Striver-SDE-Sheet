public Node copyRandomList(Node head) {
        // Time Complexity : o(n+n+n)
        // Space Complexity : o(1)
      Node prev=null;
        for(Node temp=head;temp!=null;)
        {
            // inserting the new nodes in between the existing linkedlist 
            // 1->1'->2->2'->3->3'->4->4'->null
            Node nm = new Node(temp.val);
            prev=temp;
            temp=temp.next;
            nm.next=temp;
            prev.next=nm;
        }
        for(Node temp=head;temp!=null;)
        {
            // Copy of the random pointer to new LinkedList
            
            if(temp.random!=null)
             temp.next.random=temp.random.next;
            temp=temp.next.next;
        }
       
        Node dummy = new Node(-1);
         prev=dummy;
        for(Node temp=head;temp!=null;)
        {
            // extracting the  new linkedlist
            Node curr=temp;
            prev.next=temp.next;
            prev=temp.next;
            temp=temp.next.next;
            curr.next=curr.next.next;
        }
        
        return dummy.next;
        
    }
