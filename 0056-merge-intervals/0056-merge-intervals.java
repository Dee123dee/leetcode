class Solution {
    public int[][] merge(int[][] intervals) {
        int row = intervals.length;
        int col = intervals[0].length;
        if(row==1)
        {
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>l = new ArrayList<>();
        l.add(intervals[0]);

        for(int i=1;i<row;i++)
        {
            int arr[] = l.get(l.size()-1);
            if(arr[1]>=intervals[i][0])
            {
                int small = Math.min(arr[0],intervals[i][0]);
                int large = Math.max(arr[1],intervals[i][1]);
                l.remove(l.size()-1);
                l.add(new int[]{small,large});
            }
            else
            {
                l.add(intervals[i]);
            }
        }
        int r = l.size();
        int res[][] = new int[r][2];
        for(int i=0;i<l.size();i++)
        {
            res[i][0] = l.get(i)[0];
            res[i][1] = l.get(i)[1];
        }
        return res;
    }
}