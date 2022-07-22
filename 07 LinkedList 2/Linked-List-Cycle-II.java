 public ListNode detectCycle(ListNode head) {
        // Time Complexity : o(n)
        // Space Complexity: o(1)
        ListNode slowptr=head,fastptr=head;
        while(fastptr!=null && fastptr.next!=null)
        {
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            if(slowptr==fastptr)
                break;
        }
        if(fastptr==null || fastptr.next==null)
            return null;
        slowptr=head;
        while(slowptr!=fastptr)
        {
            slowptr=slowptr.next;
            fastptr=fastptr.next;
        }
        return slowptr;
    }
