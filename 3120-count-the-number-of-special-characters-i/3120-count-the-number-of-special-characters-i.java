class Solution {
    static boolean check[];

    private static void checker(char ch) {
        ch = Character.toLowerCase(ch);
        check[ch - 'a'] = true;
    }

    public int numberOfSpecialChars(String word) {
        int count = 0;
        check = new boolean[26];

        for (char c : word.toCharArray()) {

            if (c >= 'a' && c <= 'z' && !check[c - 'a']) {

                char ch = Character.toUpperCase(c);

                if (word.indexOf(ch) != -1) {
                    count++;
                }

                checker(c);
            }

            else if (c >= 'A' && c <= 'Z'
                    && !check[Character.toLowerCase(c) - 'a']) {

                char ch = Character.toLowerCase(c);

                if (word.indexOf(ch) != -1) {
                    count++;
                }

                checker(c);
            }
        }

        return count;
    }
}