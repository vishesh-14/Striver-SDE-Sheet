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

public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Time Complexity : o(n+m)
        // Space Complexity : o(stack space i.e n+m)
          return mergeRecursive(list1,list2);
    }
    public  ListNode mergeRecursive(ListNode list1,ListNode list2)
    {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
         if(list1.val<=list2.val)
         {
               list1.next=mergeRecursive(list1.next,list2);
             return list1;
         }
        else
        {
            list2.next=mergeRecursive(list1,list2.next);
            return list2;
        }
    }
