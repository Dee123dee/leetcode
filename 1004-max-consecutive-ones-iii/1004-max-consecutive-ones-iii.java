class Solution {
    public int longestOnes(int[] nums, int k) {
       int max=-1;
       int zeros=0;
       int start=0;
       for(int i=0;i<nums.length;i++)
       {
            if(nums[i]==0)
            {
                zeros++;
            }
            while(zeros>k)
            {
                if(nums[start]==0)
                {
                    zeros--;
                }
                start++;
            }
            int len=i-start+1;
            if(max<len)
            {
                max=len;
            }
       }
        return max;
    }
}