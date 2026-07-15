class Solution {
    private static int GCD(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int oddsum = (int)Math.pow(n,2);
        int evensum = n*(n+1);
        return GCD(oddsum,evensum);
    }
}