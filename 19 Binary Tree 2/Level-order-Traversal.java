 public List<List<Integer>> levelOrder(TreeNode root) {
        // Time Compleixty : o(n)
        // Space Complexity : o(n)
        List<List<Integer>> level = new ArrayList<>();
        if(root==null)
            return level;
         Queue<TreeNode> q = new LinkedList<TreeNode>();
         q.add(root);
        while(!q.isEmpty())
        {
             int count=q.size();
             ArrayList<Integer> currLevel =new  ArrayList<Integer>();
              for(int i=0;i<count;i++)
              {
                  TreeNode front=q.poll();
                    currLevel.add(front.val);
                  if(front.left!=null)
                      q.add(front.left);
                  if(front.right!=null)
                      q.add(front.right);
              }
             level.add(currLevel);
        }
        return level;
    }