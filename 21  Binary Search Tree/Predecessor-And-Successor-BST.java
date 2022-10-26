public class Solution {
    static boolean pre=true,suc=false;
    static int prev=-1,next=-1;
    
	public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		// Write your code here.
         pre=true;
        suc=false;
         prev=next=-1;
         
         inorder(root,key);
        ArrayList<Integer> result=new ArrayList<Integer>();
         result.add(prev);
         result.add(next);
        return result;
	}
    public static void inorder(BinaryTreeNode<Integer> root,int key)
    {
         if(root==null)
             return ;
          inorder(root.left,key);
          if(suc)
           {
               next=root.data;
               suc=false;
           }
           if(root.data==key)
           {
               pre=false;
               suc=true;
           }
           if(pre)
               prev=root.data;
          
        inorder(root.right,key);
    }
}
