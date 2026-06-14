class Solution {
    private static boolean prime(int n) {
    if (n < 2) {
        return false;
    }

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
    public int minOperations(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        int x = nums[i];
        if (i % 2 == 0) {
            while (!prime(x)) {
                x++;
            }
        } else {
            while (prime(x)) {
                x++;
            }
        }
        sum+=x-nums[i];
    }

    return sum;
}
}