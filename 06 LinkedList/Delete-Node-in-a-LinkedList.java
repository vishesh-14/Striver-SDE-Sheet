public void deleteNode(ListNode node) {
        // Time complexity : o(1)
        // Space Complexity : o(1)
        node.val=node.next.val;
        node.next=node.next.next;
    }
