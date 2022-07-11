public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Time Complexity : o(n+m)
        // Space Complexity :o(1)
        if(n==0)
            return ;
        int p1=m-1,p2=n-1,p3=n+m-1;
        while(p1>-1 && p2>-1)
        {
             if(nums1[p1]>nums2[p2])
                 nums1[p3--]=nums1[p1--];
            else
                nums1[p3--]=nums2[p2--];
        }
        while(p2>-1)
            nums1[p3--]=nums2[p2--];
    }
