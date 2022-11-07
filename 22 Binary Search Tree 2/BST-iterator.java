class BSTIterator {
    // Time Compleixty : o(n)
    // Space Complexity : o(h)
    ArrayDeque<TreeNode> stack=new ArrayDeque<>();

    public BSTIterator(TreeNode root) {

        addLeft(root);
        
    }
     public  void addLeft(TreeNode root)
     {
          while(root!=null)
          {
               stack.push(root);
                root=root.left;
          }
     }
    public int next() {
        TreeNode top=stack.peek();
          stack.pop();
          addLeft(top.right);
          return top.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
