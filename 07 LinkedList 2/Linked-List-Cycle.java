 public boolean hasCycle(ListNode head) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        ListNode slowptr=head,fastptr=head;
        while(fastptr!=null && fastptr.next!=null)
        {
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
             if(slowptr==fastptr)
                 return true;
            
        }
        return false;
    }
