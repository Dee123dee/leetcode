class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int row[]=new int[r];
        int col[]=new int[c];
        long total=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                row[i]+=grid[i][j];
                col[j]+=grid[i][j];
                total+=grid[i][j];
            }
        }
        if(total%2==1){
            return false;
        }
        long temp=total;
        for(int i=0;i<r;i++){
            temp-=row[i];
            if(temp==total-temp){
                return true;
            }
        }
        temp=total;
        for(int i=0;i<c;i++){
            temp-=col[i];
            if(temp==total-temp){
                return true;
            }
        }
        return false;
    }
}