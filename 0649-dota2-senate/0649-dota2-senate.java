class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer>rq=new LinkedList<>();
        Queue<Integer>dq=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            char ch=senate.charAt(i);
            if(ch=='R')
            {
                rq.add(i);
            }
            else
            {
                dq.add(i);
            }
        }
        while(!rq.isEmpty() && !dq.isEmpty())
        {
            int rval=rq.poll();
            int dval=dq.poll();
            if(rval<dval)
            {
                rq.add(rval+n);
            }
            else
            {
                dq.add(dval+n);
            }
        }
        return rq.isEmpty() ? "Dire" : "Radiant";
    }
}