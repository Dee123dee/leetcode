class Solution {
    public int[][] sortMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int row=m-1;
        int col=1;
        List<Integer> templist=new ArrayList<>();
        int i = row;
        int j = 0;
        while(row>-1)
        {
           i = row;
           j = 0;
            while(i<m && j<n)
            {
                templist.add(mat[i++][j++]);
            }
            Collections.sort(templist,Collections.reverseOrder());
            int k=0;
            i=row;
            j=0;
            while(i<m && j<n)
            {
                mat[i++][j++]=templist.get(k++);
            }
            templist.clear();
            row--;
        }
        while(col<n-1)
        {
            j = col;
            i = 0;
            while(i<m && j<n)
            {
                templist.add(mat[i++][j++]);
            }
            Collections.sort(templist);
            int k=0;
            i=0;
            j=col;
            while(i<m && j<n)
            {
                mat[i++][j++]=templist.get(k++);
            }
            templist.clear();
            col++;
        }
        return mat;
    }
}