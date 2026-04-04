class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;

        int n = encodedText.length();
        int cols = n / rows;

        char[][] m = new char[rows][cols];

        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = encodedText.charAt(idx++);
            }
        }

        StringBuilder res = new StringBuilder();

        for (int startCol = 0; startCol < cols; startCol++) {
            int r = 0, c = startCol;
            while (r < rows && c < cols) {
                res.append(m[r][c]);
                r++;
                c++;
            }
        }

        while (res.length() > 0 && res.charAt(res.length() - 1) == ' ') {
            res.deleteCharAt(res.length() - 1);
        }

        return res.toString();
    }
}