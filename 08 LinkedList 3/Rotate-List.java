public ListNode rotateRight(ListNode head, int k) {
        // Time Complexity : o(n+n)
        // Space Complexity : o(1)
        if(head==null)
            return head;
         int count=0;
        for(ListNode temp=head;temp!=null;temp=temp.next)
            count++;
        k=k%count;
        if(count==1 || k==0)
            return head;
        int v=count-k;
        ListNode last=null,first=head;
        for(ListNode temp=head;temp!=null;temp=temp.next)
        {
            v--;
            if(v==0)
            {
                last=temp;
                first=temp.next;
            }
            if(temp.next==null)
            {
                temp.next=head;
                last.next=null;
            }
        }
        return first;
    }