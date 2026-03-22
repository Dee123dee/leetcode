class Solution {
    public boolean findRotation(int[][] mat,int[][] target){
        for(int k=0;k<4;k++){
            if(check(mat,target)){
                return true;
            }
            mat=rotate(mat);
        }
        return false;
    }

    public boolean check(int[][] a,int[][] b){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] rotate(int[][] a){
        int n=a.length;
        int[][] r=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                r[j][n-1-i]=a[i][j];
            }
        }
        return r;
    }
}