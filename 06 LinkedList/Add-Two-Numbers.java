public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Time Complexity : o(n+m)
        // Space Complexity : o(1)
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        int  carry=0;
        ListNode head=l1 ,prev=null;
         while(l1!=null && l2!=null)
         {
             int sum=l1.val+l2.val+carry;
              l1.val=sum%10;
             carry=sum/10;
                 prev=l1;
              l1=l1.next;
             l2=l2.next;
         }
         if(l2==null)
         {
              while(l1!=null)
              {
                  int sum=l1.val+carry;
                   l1.val=sum%10;
                  carry=sum/10;
                  prev=l1;
                  l1=l1.next;
              }
         }
        else
        {
            prev.next=l2;
             while(l2!=null)
             {
                  int sum=l2.val+carry;
                  l2.val=sum%10;
                 carry=sum/10;
                  prev=l2;
                 l2=l2.next;
             }
        }
        if(carry!=0)
        {
            prev.next=new ListNode(carry);
        }
        return head;
    }
