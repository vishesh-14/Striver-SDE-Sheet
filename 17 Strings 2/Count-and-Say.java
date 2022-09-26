 public String countAndSay(int n) {
         // Time Complexity : o(n*max(s))
        // Space Compleixty : o(n+stackspace)
        return find(n-1,"1");
    }
    public static String find(int n,String s)
    {
       // System.out.println(s);
        if(n==0)
            return s;
        
        StringBuilder sb =new StringBuilder();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            int c=1;
            while(i+1<len && s.charAt(i)==s.charAt(i+1))
            {
                c++;
                i++;
            }
            sb.append(c);
            sb.append(s.charAt(i));
        }
        return find(n-1,sb.toString());
    }
