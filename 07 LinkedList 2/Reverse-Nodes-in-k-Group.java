public ListNode reverseKGroup(ListNode head, int k) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        ListNode dummy= new ListNode();
        dummy.next=head;
        ListNode prevHead=dummy;
        int count=0;
        for(ListNode temp=head;temp!=null;temp=temp.next)
        {
             count++;
            if(count==k)
            {
              
                ListNode first=prevHead.next,last=temp.next;
                prevHead.next=reverse(prevHead.next,last);
                 prevHead=first;
                 temp=first;
   
                count=0;
         
            }
            if(temp==null)
                break;
        }
        return dummy.next;
    }
    public static ListNode reverse(ListNode head,ListNode end)
    {
        ListNode curr=null,temp=end;
        while(head!=end)
        {
            curr=head;
            head=head.next;
            curr.next=temp;
            temp=curr;
        }
        return temp;
    }
