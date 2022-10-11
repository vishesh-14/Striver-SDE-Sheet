public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        List<List<Integer>> result=new ArrayList<>();
        ArrayDeque<TreeNode> stack1=new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> stack2=new ArrayDeque<TreeNode>();
        
        
        boolean flag=true;
         if(root!=null)
             stack1.push(root);
        ArrayList<Integer> sub_result=new ArrayList<Integer>();
        while(!stack1.isEmpty())
        {
            TreeNode top=stack1.peek();
            sub_result.add(top.val);
            stack1.pop();
             if(flag)
             {
                 if(top.left!=null)
                     stack2.push(top.left);
                 if(top.right!=null)
                     stack2.push(top.right);
             }
            else
            {
                 if(top.right!=null)
                     stack2.push(top.right);
                  if(top.left!=null)
                      stack2.push(top.left);
            }
             if(stack1.isEmpty())
             {
                 result.add(sub_result);
                 sub_result=new ArrayList<Integer>();
                 ArrayDeque<TreeNode> temp=stack1;
                  stack1=stack2;
                 stack2=temp;
                 flag=!flag;
             }
            
        }
        return  result;
    }
//---------------------------------------------------------------------------------------------------------//

public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Time Complexity : o(n)
        // Space Complexity : o(n)
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        int level=0;
         if(root!=null)
             queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            ArrayList<Integer> sub_result=new ArrayList<Integer>();
            for(int i=0;i<size;i++)
            {
                TreeNode front=queue.poll();
                  sub_result.add(front.val);
                 if(front.left!=null)
                     queue.add(front.left);
                if(front.right!=null)
                    queue.add(front.right);
            }
            level++;
             if(level%2==0)
             {
                 reverse(0,sub_result.size()-1,sub_result);
             }
            result.add(sub_result);
            
        }
        return  result;
    }
    public static void reverse(int p1,int p2,ArrayList<Integer> sub_level)
    {
         while(p1<p2)
         {
             int temp=sub_level.get(p1);
             sub_level.set(p1,sub_level.get(p2));
             sub_level.set(p2,temp);
             p1++;
             p2--;
         }
    }
