class Solution {
    static List<List<Integer>>res;
    private static void backtracking(List<Integer>l ,int start, int n,int k,int sum)
    {
        if(l.size()==k)
        {
            if(sum==n)
            {
                res.add(new ArrayList<>(l));
            }
            return;
        }

        for(int i=start;i<=9;i++)
        {
            l.add(i);
            backtracking(l,i+1,n,k,sum+i);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backtracking(l,1,n,k,0);
        return res;
    }
}