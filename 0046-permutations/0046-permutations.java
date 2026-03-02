class Solution {
    static List<List<Integer>>res;
    private static void Backtracking(List<List<Integer>>res,int arr[],int start,List<Integer>l,boolean visted[])
    {
        if(l.size()==arr.length)
        {
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(visted[i])
            {
                continue;
            }
            l.add(arr[i]);
            visted[i]=true;
            Backtracking(res,arr,i+1,l,visted);
            l.remove(l.size()-1);
            visted[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        boolean visted[]=new boolean[nums.length];
        Backtracking(res,nums,0,new ArrayList<>(),visted);
        return res;
    }
}