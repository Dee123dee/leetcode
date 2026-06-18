class Solution {
    public int dominantIndex(int[] nums) {
        int m1=0;
        int m2=-1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[m1]<nums[i])
            {
                m2=m1;
                m1=i;
            }
            else if( m2==-1 || nums[m2]<nums[i])
            {
                m2=i;
            }
        }
        return nums[m2] * 2 <= nums[m1] ? m1 : -1 ;
    }
}