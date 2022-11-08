public String serialize(TreeNode root) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        StringBuilder sb=new StringBuilder();
         Queue<TreeNode> queue=new LinkedList<TreeNode>();
          queue.add(root);
         while(!queue.isEmpty())
         {
              int size=queue.size();
              for(int i=0;i<size;i++)
              {
                  TreeNode front=queue.poll();
                    if(front==null)
                    {
                        sb.append("N@");
                    }
                    else
                    {
                        sb.append(front.val+"@");
                       queue.add(front.left);
                       queue.add(front.right);
                   }
              }
           
          }
          return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        
        String res[]=data.split("@");
        
        if(res[0].equals("N"))
        return null;
        System.out.println(Arrays.toString(res));
        Queue<TreeNode> prevLevel=new LinkedList<TreeNode>();
         TreeNode root=new TreeNode(Integer.parseInt(res[0]));
          prevLevel.add(root);
         for(int i=1;i<res.length;i+=2)
         {
             String str1=res[i],str2=res[i+1];
             
             TreeNode front=prevLevel.poll();
            
             
              if(!str1.equals("N"))
              {
                   front.left=new TreeNode(Integer.parseInt(str1));
                   prevLevel.add(front.left);
              }
              if(!str2.equals("N"))
              {
                   front.right=new TreeNode(Integer.parseInt(str2));
                   prevLevel.add(front.right);
              }
         }
       return root;
    }
