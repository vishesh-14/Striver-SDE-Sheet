 public int[] nextGreaterElements(int[] nums) {
        // Time Complexity : o(n+n)
        // Space Complexity : o(n)
        ArrayDeque<Integer> st=new ArrayDeque<Integer>();
        int n=nums.length;
        for(int i=n-1;i>=0;i--)
            st.push(nums[i]);
        int [] nextGreater=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums[i]>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                nextGreater[i]=-1;
            }
            else
                nextGreater[i]=st.peek();
            st.push(nums[i]);
        }
        return nextGreater;
    }
