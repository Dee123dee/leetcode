import java.util.*;
class Solution {
    public int calculate(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int num = 0;
        int res = 0;
        int sign = 1;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } 
            else if (ch == '+') {
                res += num * sign;
                num = 0;
                sign = 1;
            } 
            else if (ch == '-') {
                res += num * sign;
                num = 0;
                sign = -1;
            } 
            else if (ch == '(') {
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
                num = 0;
            } 
            else if (ch == ')') {
                res += num * sign;
                num = 0;
                int prevSign = st.pop();
                int prevRes = st.pop();
                res = prevRes + prevSign * res;
            }
        }
        return res + num * sign;
    }
}