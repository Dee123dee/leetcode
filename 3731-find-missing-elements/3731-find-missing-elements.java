class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(nums[i],max);
            min = Math.min(min,nums[i]);
        }
        int v = 0;
        Arrays.sort(nums);
        List<Integer>l = new ArrayList<>();
        for(int i=min;i<=max;i++)
        {
            if(nums[v]!=i)
            {
                l.add(i);
            }
            else
            {
                v++;
            }
        }
        return l;
    }
}