 public ListNode reverseList(ListNode head) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        if(head==null)
            return null;
       // return reverseIterative(head);
        return reverseRecursive(head);
    }
    public static ListNode reverseRecursive(ListNode head)
    {
         if(head.next==null)
             return head;
        ListNode newHead=reverseRecursive(head.next);
         head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static ListNode reverseiterative(ListNode head)
    {
        ListNode curr=null,temp=null;
         while(head!=null)
         {
             curr=head;
             head=head.next;
             curr.next=temp;
             temp=curr;
         }
        return temp;
    }