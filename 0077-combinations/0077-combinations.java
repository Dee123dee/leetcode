class Solution {
    static List<List<Integer>>res;

    private static void backtracking(List<Integer>l ,int start, int n,int k)
    {
        if(l.size()==k)
        {
            res.add(new ArrayList<>(l));
            return;
        }

        for(int i=start;i<=n;i++)
        {
            l.add(i);
            backtracking(l,i+1,n,k);
            l.remove(l.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backtracking(l,1,n,k);
        return res;
    }
}