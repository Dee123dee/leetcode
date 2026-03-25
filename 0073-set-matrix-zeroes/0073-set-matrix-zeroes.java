class Solution {
    public void setZeroes(int[][] matrix) {
        int ans[][] = new int[matrix.length][matrix[0].length];

        // Step 1: initialize ans with original values
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                ans[i][j] = matrix[i][j];
            }
        }

        // Step 2: process zeros from original matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {   // ✅ check for 0
                    rows(ans, i);
                    cols(ans, j);
                }
            }
        }

        // Step 3: copy back to original matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }

    private static void rows(int ans[][], int row) {
        for(int i = 0; i < ans[0].length; i++) {
            ans[row][i] = 0;
        }
    }

    private static void cols(int ans[][], int col) {
        for(int i = 0; i < ans.length; i++) {  // ✅ fixed
            ans[i][col] = 0;
        }
    }
}