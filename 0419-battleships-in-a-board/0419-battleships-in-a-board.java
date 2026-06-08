class Solution {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int res = 0;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 'X') {
                    if ((r == 0 || board[r - 1][c] != 'X') &&
                        (c == 0 || board[r][c - 1] != 'X')) {
                        res++;
                    }
                }
            }
        }
        return res;
    }
}