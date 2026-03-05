class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long mod = 1000000007;
        long left = 1;
        long right = (long) n * Math.min(a, b);
        long lcm = lcm(a, b);
        while (left < right) {
            long mid = left + (right - left) / 2;
            long count = mid / a + mid / b - mid / lcm;
            if (count < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (int) (left % mod);
    }
    private long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    private long lcm(long x, long y) {
        return (x * y) / gcd(x, y);
    }
}