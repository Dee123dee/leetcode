class Solution {
    private static boolean prime(int n)
    {
        if(n<=1)
        {
            return false;
        }

        for(int i=2;i<n;i++)
        {
            if(n % i==0)
            {
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        if(n==2||n==3|n==5||n==7)
        {
            return n;
        }
        
        else if(n<10)
        {
            return 0;
        }
           
        int reverse = 0;
        int s = n;
        while(s>0)
        {
            reverse = (s%10) + reverse*10;
            s/=10;
        }

        int sum = 0;
        int start = Math.min(reverse,n);
        int end = Math.max(reverse,n);
        for(int i = start;i<=end;i++)
        {
            if(prime(i))
            {
                sum+=i;
            }
        }
        return sum;
    }
}