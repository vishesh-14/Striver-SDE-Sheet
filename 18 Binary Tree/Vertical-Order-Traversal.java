 public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Time Complexity : o(n)
        // Space Complexity : o(n+n)
          TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>(); 
       
         doPostOrder(root,0,map);
        List<List<Integer>> vertical=new ArrayList<>();
    
        for(Map.Entry it : map.entrySet())
        {
            ArrayList<Integer> front=(ArrayList<Integer>)it.getValue();
             //Collections.sort(arr);
            Collections.sort(front);
            
             vertical.add(front);
        }
        return vertical;
       
    }
    public static void doPostOrder(TreeNode root,int line,TreeMap<Integer,ArrayList<Integer>> map)
    {
         if(root==null)
             return;
           if(map.containsKey(line))
           {
               ArrayList<Integer> al=map.get(line);
               al.add(root.val);
               map.put(line,al);
           }
        else
        {
            ArrayList<Integer> al=new ArrayList<Integer>();
            al.add(root.val);
            map.put(line,al);
        }
        doPostOrder(root.left,line-1,map);
        doPostOrder(root.right,line+1,map);
    }
