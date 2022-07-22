 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Time Complexity : o(n+m)
        // Space Complexity : o(1)
        int count1=0,count2=0;
        for(ListNode temp=headA;temp!=null;temp=temp.next)
            count1++;
        for(ListNode temp=headB;temp!=null;temp=temp.next)
            count2++;
        ListNode temp1=headA,temp2=headB;
        if(count1>count2)
        {
            int diff=count1-count2;
            while(diff-->0)
                temp1=temp1.next;
        }
        else
        {
             int  diff=count2-count1;
             while(diff-->0)
                 temp2=temp2.next;
        }
        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }