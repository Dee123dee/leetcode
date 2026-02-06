class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {

            // 1. Remove indices out of window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller elements (not useful)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(i);

            // 4. Window formed
            if (i >= k - 1) {
                ans[idx++] = nums[dq.peekFirst()];
            }
        }

        return ans;
    }
}
