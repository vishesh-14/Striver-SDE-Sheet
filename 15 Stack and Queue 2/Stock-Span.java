class StockSpanner {
 int idx=0;
    ArrayDeque<Node> st =new ArrayDeque<Node>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
         Node nm=new Node(price,idx);
        
        while(!st.isEmpty() && st.peek().val<=price)
            st.pop();
         int res=1;
         if(st.isEmpty())
            res=idx+1;
          else 
          res=idx-st.peek().idx;
         st.push(nm);
        idx++;
        return res;
    }
}
class Node
{
    int val,idx;
     Node(int val,int idx)
     {
          this.val=val;
         this.idx=idx;
     }
}
