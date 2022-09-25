class Solution {

    
    public String longestCommonPrefix(String[] strs) {
        // Time Complexity : o(n*len)
        // Space Complexity : o(n*len*26)
      Trie root =new Trie(); 
       int n=strs.length;
        for(int i=0;i<n;i++)
        {
            buildTrie(strs[i],root);
        }
        StringBuilder  sb =new StringBuilder();
        for(int i=0;i<strs[0].length();i++)
        {
             char ch=strs[0].charAt(i);
              root=root.arr[ch-'a'];
             if(root.count!=n)
                 break;
            sb.append(ch);
                 
        }
        return sb.toString();
    }
    public static void buildTrie(String s,Trie root)
    {
         Trie temp=root;
         int len=s.length();
        for(int i=0;i<len;i++)
        {
             char ch=s.charAt(i);
             if(temp.arr[ch-'a']==null)
             {
                 temp.arr[ch-'a']=new Trie();
             }
            temp=temp.arr[ch-'a'];
            temp.count++;
        }
    }
}
class Trie
{
    int count=0;
    Trie[] arr= new Trie[26];
    
}
