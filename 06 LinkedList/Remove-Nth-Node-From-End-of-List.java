static int k=-1;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Time Complexity : o(n)
        // Space Complexity : o(n) i.e stack space 
        k=n;
        return  findHead(head);
    }
    public static ListNode findHead(ListNode head)
    {
         if(head==null)
             return null;
          head.next=findHead(head.next);
         k--;
        if(k==0)
        {
            return head.next;
        }
        return head;
    }
