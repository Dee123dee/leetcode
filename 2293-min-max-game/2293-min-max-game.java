class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        List<Integer> l  = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(nums[i]);
        }
        while(true)
        {
            if(l.size()==1)
            {
                break;
            }
            int size = l.size();
            int flag=0;
            for(int i=0;i<size;i+=2)
            {
                if(flag==0)
                {
                    l.add(Math.min(l.get(i),l.get(i+1)));
                    flag=1;
                }
                else
                {
                    l.add(Math.max(l.get(i),l.get(i+1)));
                    flag = 0;
                }
            }
            for(int i=0;i<size;i++)
            {
                l.removeFirst();
            }   
        }
        return l.get(0);
    }
}