public boolean isAnagram(String s, String t) {
        int n=s.length(),m=t.length();
        if(n!=m)
            return false;
        // Time Complexity : o(n+26)
        // Space Complexity : o(26)
        int [] c = new int[26];
        for(int i=0;i<n;i++)
        {
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
             if(c[i]!=0)
                 return false;
        }
         return true;
    }
