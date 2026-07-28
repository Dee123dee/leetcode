class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = false;
        boolean des = false;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>nums[i])
            {
                des = true;
            }
            else if(nums[i+1]<nums[i])
            {
                inc = true;
            }
        }

        if(inc && des)
        {
            return false;
        }
        return true;
    }
}