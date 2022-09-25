 public static  void solve()
    {
    // Time Complexity : o(n)
    // Space Complexity : o(1)
    // By using double hashing concept 
         String b=obj.next();
        String a=obj.next();
       
        int m=b.length(),n=a.length();
         if(m>n)
         {
             System.out.println("0");
             return;
         }
        long ha1=0,hb1=0,ans=0,ha2=0,hb2=0;
        int mod=(int)1e9+7;
        long  p=97,p1=p,v=73,v1=v;
        
        for(int i=0;i<m;i++)
        {
            long   ch=b.charAt(i);
            
            hb1=(hb1%mod+(ch*p1)%mod)%mod;
            hb1=hb1%mod;
           
            p1=(p1%mod*p%mod)%mod;
        }
        for(int i=0;i<m;i++)
        {
            long   ch=b.charAt(i);
            
            hb2=(hb2%mod+(ch*v1)%mod)%mod;
            hb2=hb2%mod;
           
            v1=(v1%mod*v%mod)%mod;
        }
        
        v1=v;
        p1=p;
        for(int i=0;i<m;i++)
        {
            long   ch=a.charAt(i);
            ha1=(ha1%mod+(ch*p1)%mod)%mod;
            ha1=ha1%mod;
            p1=(p1%mod*p%mod)%mod;
        }
        for(int i=0;i<m;i++)
        {
            long   ch=a.charAt(i);
            ha2=(ha2%mod+(ch*v1)%mod)%mod;
            ha2=ha2%mod;
            v1=(v1%mod*v%mod)%mod;
        }
     
        if(ha1==hb1 && ha2==hb2)
         ans++;
        long  p2=p,v2=v;
        for(int i=m;i<n;i++)
        {
            long   ch=a.charAt(i-m);
            ha1=(ha1%mod-(ch*p2)%mod+mod)%mod;
           
              ch=a.charAt(i);
            ha1=(ha1%mod+(ch*p1)%mod)%mod;
           
            hb1=(hb1%mod*p%mod)%mod;
            
            
            ch=a.charAt(i-m);
            ha2=(ha2%mod-(ch*v2)%mod+mod)%mod;
           
              ch=a.charAt(i);
            ha2=(ha2%mod+(ch*v1)%mod)%mod;
           
            hb2=(hb2%mod*v%mod)%mod;
        
         
            
            if(ha1==hb1 && ha2==hb2)
            {
             ans++;
            }
          p2=(p2%mod*p%mod)%mod;
         p1=(p1%mod*p%mod)%mod;
         v2=(v2%mod*v%mod)%mod;
         v1=(v1%mod*v%mod)%mod;
        }
        
        
        System.out.println(ans);
    }
