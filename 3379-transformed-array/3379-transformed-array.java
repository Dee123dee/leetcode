class Solution {
    public int[] constructTransformedArray(int[] nums) {
         int n = nums.length;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                res[i] = 0;
            } else {
                int idx = (i + nums[i]) % n;
                if(idx < 0){
                    idx += n;
                }
                res[i] = nums[idx];
            }
        }
        return res;
    }
}