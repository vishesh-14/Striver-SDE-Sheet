  public Node connect(Node root) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
         if(root==null)
             return null;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        Node prev=null;
         while(!queue.isEmpty())
         {
              int size=queue.size();
              prev=null;
             for(int i=0;i<size;i++)
             {
                 Node front=queue.poll();
                  front.next=prev;
                  prev=front;
                  if(front.right!=null)
                      queue.add(front.right);
                  if(front.left!=null)
                      queue.add(front.left);
             }

         }
        return root;
        
    }