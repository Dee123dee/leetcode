class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            l.add(i);
        }
        int index=0;
        while(l.size()>1)
        {
            int t=1;
            while(t<k)
            {
                index++;
                t++;
                if(index>=l.size())
                {
                    index=0;
                }
            }
            l.remove(index);
            if(index-1==l.size()-1)
            {
                index=0;
            }
        }
        return l.get(0);
    }
}