class Solution {
    public int splitArray(int[] nums, int k) {

        int left = 0;
        int right = 0;

        for (int n : nums) {
            left = Math.max(left, n);
            right += n;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canSplit(int[] nums, int k, int maxSum) {

        int count = 1;
        int curr = 0;

        for (int n : nums) {

            curr += n;

            if (curr > maxSum) {
                count++;
                curr = n;

                if (count > k)
                    return false;
            }
        }

        return true;
    }
}