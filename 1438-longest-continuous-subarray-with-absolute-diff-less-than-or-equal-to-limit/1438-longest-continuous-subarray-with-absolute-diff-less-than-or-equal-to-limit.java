class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer>mq=new ArrayDeque<>();
        Deque<Integer>miq=new ArrayDeque<>();
        int left=0;
        int ans=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            while(!mq.isEmpty() && nums[mq.peekLast()]<nums[right])
            {
                mq.pollLast();
            }
            while(!miq.isEmpty() && nums[miq.peekLast()]>nums[right])
            {
                miq.pollLast();
            }
            mq.offerLast(right);
            miq.offerLast(right);
            while(nums[mq.peekFirst()]-nums[miq.peekFirst()]>limit)
            {
                if(mq.peekFirst()==left)
                {
                    mq.pollFirst();
                }
                if(miq.peekFirst()==left)
                {
                    miq.pollFirst();
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}