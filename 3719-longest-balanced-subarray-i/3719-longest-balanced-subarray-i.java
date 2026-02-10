class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int distinctEven = 0;
            int distinctOdd = 0;

            int[] freq = new int[100001];

            for (int j = i; j < n; j++) {
                int val = nums[j];

                if (freq[val] == 0) {
                    if (val % 2 == 0) distinctEven++;
                    else distinctOdd++;
                }

                freq[val]++;

                if (distinctEven == distinctOdd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}