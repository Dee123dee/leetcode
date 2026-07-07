class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long digitsum=0;
        long val = 0;
        long tens = 1;
        while(n>0)
        {
            long m = n % 10;
            digitsum+=m;
            if(m!=0)
            {
                sum = sum + m * tens;
                tens*=10;
            }
            n/=10;
        }
        return sum*digitsum;
    }
}