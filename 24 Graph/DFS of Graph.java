 public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Time Complexity : o(V+E)
        // Space Complexity : o(v)
        ArrayList<Integer> result=new ArrayList<>();
         boolean [] visited=new boolean[V+1];
        doDfs(0,result,visited,adj);
        return result;
    }
    public static void doDfs(int u,ArrayList<Integer>result,boolean visited[],ArrayList<ArrayList<Integer>> adj )
    {
        result.add(u);
        visited[u]=true;
        for(int x : adj.get(u))
        {
             if(!visited[x])
              doDfs(x,result,visited,adj);
        }
    }
