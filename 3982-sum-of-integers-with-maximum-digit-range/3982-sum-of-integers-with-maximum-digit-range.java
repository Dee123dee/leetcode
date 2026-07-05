class Solution {
    public int maxDigitRange(int[] nums) {
        int[] sumByRange = new int[10];

        for (int num : nums) {
            int original = num;
            int maxDigit = 0;
            int minDigit = 9;
            int x = num;

            while (x > 0) {
                maxDigit = Math.max(maxDigit, x % 10);
                minDigit = Math.min(minDigit, x % 10);
                x /= 10;
            }

            sumByRange[maxDigit - minDigit] += original;
        }

        for (int range = 9; range >= 0; range--) {
            if (sumByRange[range] != 0) {
                return sumByRange[range];
            }
        }

        return 0;
    }
}