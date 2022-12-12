class Solution {
    public Node cloneGraph(Node node) {
      if(node==null)
      return null;
      HashMap<Node,Node> map=new HashMap<>();
      HashSet<Integer> visited=new  HashSet<>();
        
       traverse(node,map,visited);
   
        return map.get(node);
    }

public static  void traverse(Node node,HashMap<Node,Node> map,HashSet<Integer> visited)
    {
         Node nm=new Node(node.val);
        
         map.put(node,nm);
         visited.add(node.val);
         List<Node> list=node.neighbors;
         for(Node x : list)
         {
            
            if(!visited.contains(x.val))
            {
                traverse(x,map,visited);
            } 
            nm.neighbors.add(map.get(x)); 
         }
    }
}