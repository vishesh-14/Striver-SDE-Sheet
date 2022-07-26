 public int trap(int[] height) {
        // Time Complexity : o(n)
        // Space Complexity : o(1)
        int n=height.length;
          int amount=0,leftMax=0,rightMax=0,p1=0,p2=n-1;
         while(p1<=p2)
         {
              if(height[p1]<=height[p2])
              {
                   if(height[p1]>leftMax)
                       leftMax=height[p1];
                  else
                      amount=amount+leftMax-height[p1];
               p1++;
              }
             else
             {
                  if(height[p2]>=rightMax)
                      rightMax=height[p2];
                 else
                     amount=amount+rightMax-height[p2];
                 p2--;
             }
                 
         }
        return amount;
    }
