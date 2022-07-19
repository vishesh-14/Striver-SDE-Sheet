public ListNode middleNode(ListNode head) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        ListNode slowptr=head,fastptr=head;
        while(fastptr!=null && fastptr.next!=null)
        {
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        return slowptr;
    }
