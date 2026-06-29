class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long res = 0;
        Arrays.sort(nums);

        for(int i = nums.length-1;i>=nums.length-k;i--)
        {
            if(mul>1)
            {
                res = res + (1L*nums[i]*mul);
            }
            else
            {
                res+=nums[i];
            }
            mul--;
        }
        return res;
    }
}