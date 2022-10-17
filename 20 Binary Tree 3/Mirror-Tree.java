void mirror(Node node) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
         modifyTree(node);
    }
    public static void modifyTree(Node root)
    {
         if(root==null)
         return;
          swap(root);
          modifyTree(root.left);
          modifyTree(root.right);
          
    }
    public static void swap(Node root)
    {
         Node temp=root.left;
         root.left=root.right;
         root.right=temp;
         
    }
