public int largestRectangleArea(int[] heights) {
        // Time Complexity : o(n+n)
        // Space Complexity : o(n)
        int n=heights.length;
        int maxArea=0;
        ArrayDeque<Integer> st = new ArrayDeque<Integer>();
         int [] rightMin =new int[n];
         for(int i=n-1;i>=0;i--)
         {
             while(!st.isEmpty() && heights[st.peek()]>=heights[i])
             {
                 st.pop();
             }
              if(st.isEmpty())
                  rightMin[i]=n;
             else
                 rightMin[i]=st.peek();
             st.push(i);
         }
        
        st.clear();
        for(int i=0;i<n;i++)
        {
             while(!st.isEmpty() && heights[st.peek()]>=heights[i])
             {
                 st.pop();
             }
             if(st.isEmpty())
             {
                int area=(rightMin[i])*heights[i];
                 maxArea=Math.max(maxArea,area);
             }
            else
            {
                int leftMin=st.peek();
                int area=(rightMin[i]-leftMin-1)*heights[i];
                maxArea=Math.max(maxArea,area);
            }
            st.push(i);
        }
        return maxArea;
    }
