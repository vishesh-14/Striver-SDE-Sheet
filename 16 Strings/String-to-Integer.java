 public int myAtoi(String s) {
       StringBuilder sb = new StringBuilder();
        int x=1,n=s.length();
    
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='-')
            {
             x=-1;
                while(i<n)
                {
                    i++;
                    if(i<n && s.charAt(i)>='0' && s.charAt(i)<='9')
                    {
                        sb.append(s.charAt(i));
                    }
                    else
                        break;
                    
                }
                if(sb.length()==0)
                    return 0;
                else
                    break;
                
            }
            else if(ch=='+')
            {
                 while(i<n)
                {
                    i++;
                    if(i<n && s.charAt(i)>='0' && s.charAt(i)<='9')
                    {
                        sb.append(s.charAt(i));
                    }
                    else
                        break;
                    
                }
                if(sb.length()==0)
                    return 0;
                else
                    break;
            }
            else if(ch>='0' && ch<='9')
            {
                 while(i<n)
                {
                    
                    if(s.charAt(i)>='0' && s.charAt(i)<='9')
                    {
                        sb.append(s.charAt(i));
                    }
                    else
                        break;
                                        
                   i++;                    

                }
                
             break;
            }
            else
            {
                if(ch!=' ')
                break;
            }
            
       
    }
       
      
        long  k=1,ans=0,k1=-1;
        for(int i=0;i<sb.length();i++)
        {
             if(sb.charAt(i)!='0')
               break;
             k1=i;
        }
        boolean b=false;
     
        for(int i=sb.length()-1;i>k1;i--)
        {
            ans=ans+(sb.charAt(i)-'0')*k;
            if(ans>Integer.MAX_VALUE || k>Integer.MAX_VALUE)
            {
                b=true;
                break;
            }
            
            
            k=k*10;
        }
       
       if(b)
      {
           if(x==-1)
                return Integer.MIN_VALUE;
            
            return Integer.MAX_VALUE;
      }
       
        return (int)ans*x;
    }
