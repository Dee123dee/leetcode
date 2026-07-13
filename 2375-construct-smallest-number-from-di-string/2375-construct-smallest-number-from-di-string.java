class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> s = new Stack<>();
        int num = 1;
        String ans = "";
        s.push(num);
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (c == 'D') {
                s.push(++num);
            } else {
                while (!s.isEmpty()) {
                    ans += s.pop();
                }
                s.push(++num);
            }
        }
        while (!s.isEmpty()) {
            ans += s.pop();
        }
        return ans;
    }
}