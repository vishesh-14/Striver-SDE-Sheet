 public String longestPalindrome(String s) {
        // Time Complexity : o(n*n)
        // Space Compexity  : o(1)
        int firstPos=-1,lastPos=-1,len=s.length(),maxi=0;
        for(int i=0;i<len;i++)
        {
            int p1=i,p2=i;
            while(p1>=0 && p2<len && s.charAt(p1)==s.charAt(p2))
            {
                if(p2-p1+1>maxi)
                {
                    maxi=p2-p1+1;
                    firstPos=p1;
                    lastPos=p2;
                }
                p1--;
                p2++;
            }
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<len && s.charAt(p1)==s.charAt(p2))
            {
                 if(p2-p1+1>maxi)
                 {
                     maxi=p2-p1+1;
                     firstPos=p1;
                     lastPos=p2;
                 }
                p1--;
                p2++;
            }
        }
        //System.out.println(firstPos+" "+lastPos);
        return s.substring(firstPos,lastPos+1);
        
    }
