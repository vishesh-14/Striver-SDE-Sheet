public int findDuplicate(int[] nums) {
        // Time Complexity : o(n)
        // Space Complexit : o(1)
        int n=nums.length;
        int slow=nums[0],fast=nums[0];
        do
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
