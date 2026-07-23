class Solution {
    HashMap<Integer,Integer>hm;
    public boolean isDigitorialPermutation(int n) {
        hm = new HashMap<>();
        hm.put(0,1);
        hm.put(1,1);
        hm.put(2,2);
        hm.put(3,6);
        hm.put(4,24);
        hm.put(5,120);
        hm.put(6,720);
        hm.put(7,5040);
        hm.put(8,40320);
        hm.put(9,362880);
        long org = n;
        long sum = 0;
        while(n>0)
        {
            int m = n % 10;
            sum+=hm.get(m);
            n/=10;
        }
        
        if(org==sum)
        {
            return true;
        }

        int o[] = new int[10];
        int rsum[] = new int[10];
        while(org>0)
        {
            o[(int)org%10]++;
            org/=10;
        }

        while(sum>0)
        {
            rsum[(int)sum%10]++;
            sum/=10;
        }
        return Arrays.equals(o,rsum);
    }
}