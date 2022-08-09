class Solution {
    static List<List<String>> result= new ArrayList<>();
    public List<List<String>> partition(String s) {
        // Time Complexity : o(2^n*k*(n/2))
        // Space Complexity : o(k*(n/2))
        result.clear();
        ArrayList<String> sub_res=new ArrayList<String>(); 
        doParition(0,s,sub_res);
        return result;
    }
    public static void doParition(int idx,String s,ArrayList<String> sub_res)
    {
        int n=s.length();
         if(idx==n)
         {
            
             result.add(new ArrayList<String>(sub_res));
             return;
         }
        
        StringBuilder sb = new StringBuilder();
        for(int i=idx;i<n;i++)
        {
            sb.append(s.charAt(i));
             if(check(sb))
             {
                 sub_res.add(sb.toString());
                  doParition(i+1,s,sub_res);
                 sub_res.remove(sub_res.size()-1);
             }
        }
    }
    public static boolean check(StringBuilder sb )
    {
         int i=0,j=sb.length()-1;
        while(i<=j)
        {
            if(sb.charAt(i)!=sb.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
