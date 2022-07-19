public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Time Complexity : o(n+m)
        // Space Complexity : o(1)
        ListNode dummy = new ListNode();
        ListNode prev=dummy,p=list1,q=list2;
         while(p!=null && q!=null)
         {
              if(p.val<=q.val)
              {
                  prev.next=p;
                  prev=p;
                  p=p.next;
              }
             else
             {
                 prev.next=q;
                 prev=q;
                 q=q.next;
             }
         }
        if(p!=null)
            prev.next=p;
         if(q!=null)
             prev.next=q;
        return dummy.next;
    }
