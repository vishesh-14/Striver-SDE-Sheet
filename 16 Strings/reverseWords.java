 public String reverseWords(String s) {
         TimeComplexity : o(2*n)
         SpaceComplexity: o(1)
        StringBuilder sb =new StringBuilder(s);
        sb.append(" ");
        int len=sb.length(),p1=0;
        for(int i=0;i<len;i++)
        {
             char ch=sb.charAt(i);
             if(ch==' ')
             {
                 reverse(sb,p1,i-1);
                 p1=i+1;
             }
        }
        sb.deleteCharAt(len-1);
        System.out.println(sb);
        reverse(sb,0,len-2);
        return sb.toString();
    }
    public static void reverse(StringBuilder sb,int p1,int p2)
    {
        while(p1<p2)
        {
         char temp=sb.charAt(p1);
         sb.setCharAt(p1,sb.charAt(p2));
          sb.setCharAt(p2,temp);
            p1++;
            p2--;
        }
    }