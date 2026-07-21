class Solution 
{
    public boolean isMiddleElementUnique(int[] nums) 
    {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i : nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        int mid = nums.length/2;
        return hm.get(nums[mid]) > 1 ? false : true;
    }
}