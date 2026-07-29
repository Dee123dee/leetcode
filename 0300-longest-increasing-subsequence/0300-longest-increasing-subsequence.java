class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length, size = 0;
        int[] t = new int[n];
        for (int x : nums) {
            int left = 0, right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (t[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            t[left] = x;
            if (left == size) size++;
        }

        return size;
    }
}