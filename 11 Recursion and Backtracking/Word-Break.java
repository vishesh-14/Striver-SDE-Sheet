import java.util.*;

public class Solution {
static ArrayList<String> result = new ArrayList<String>();
    public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// TimeComplexity :o(n!*n)
        // Space Complexity :o(n*k)
        result.clear();
           HashSet<String> dict = new HashSet<String>();
         
         for(int i=0;i<dictionary.size();i++)
              dict.add(dictionary.get(i));
        ArrayList<String> sub_res = new ArrayList<String>();
             findBreak(0,s,sub_res,dict);
        return result;
	}
    public static void findBreak(int i,String s,ArrayList<String> sub_res,HashSet<String> dict)
    {
         if(i==s.length())
         {
             StringBuilder copy=new StringBuilder();
             for(int j=0;j<sub_res.size();j++)
             {
                 copy.append(sub_res.get(j));
                 copy.append(" ");
             }
             result.add(copy.toString());
             return;
         }
        StringBuilder sb= new StringBuilder();
        for(int j=i;j<s.length();j++)
        {
            sb.append(s.charAt(j));
            if(dict.contains(sb.toString()))
            {
                
                sub_res.add(sb.toString());
                findBreak(j+1,s,sub_res,dict);
                sub_res.remove(sub_res.size()-1);
            }
        }
    }
    
}
