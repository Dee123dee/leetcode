class Solution {
    public int smallestNumber(int n, int t) {
        int product = 1;
        int org = n;
        while(n>0)
        {
            int m = n % 10;
            n/=10;
            product = product * m;
        }
        boolean flag = true;
        n = org;
        int i = 1;
        while(product % t != 0)
        {
            n = org + i;
            product = 1;
            flag = false;
            while(n>0)
            {
                int m = n % 10;
                n/=10;
                product = product * m;
            }
            i++;
        }
        if(flag)
        {
            return n;
        }
        return org + i -1;
    }
}