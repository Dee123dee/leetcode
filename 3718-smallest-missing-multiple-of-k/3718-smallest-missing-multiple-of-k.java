class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>s = new HashSet<>();
        if(nums.length==1)
        {
            return nums[0]==k ? nums[0]+k : k;
        }
        for(int i : nums)
        {
            s.add(i);
        }
        int mul = k;
        for(int i=1;i<=nums.length;i++)
        {
            if(!s.contains(k))
            {
                return k;
            }
            k = k + mul;
        }
        return nums[nums.length-1] + mul;
    }
}