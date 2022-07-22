public boolean isPalindrome(ListNode head) {
        // TimeComplexity : o(n)
        // SpaceComplexity : o(1)
        ListNode slowptr=head,fastptr=head;
        boolean b=false;
        while(true)
        {
            if(fastptr==null)
                break;
            else if(fastptr.next==null)
            {
                b=true;
                break;
            }
             slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        if(b)
        slowptr=slowptr.next;
        slowptr=reverse(slowptr);
        fastptr=head;
        while(slowptr!=null)
        {
             if(fastptr.val!=slowptr.val)
                 return false;
            slowptr=slowptr.next;
            fastptr=fastptr.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode temp=null,curr=null;
        while(head!=null)
        {
            curr=head;
            head=head.next;
            curr.next=temp;
            temp=curr;
        }
        return temp;
    }
