import java.util.*;

class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();

        StringBuilder str = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(num);
                stringStack.push(str);

                num = 0;
                str = new StringBuilder();
            }

            else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder prev = stringStack.pop();

                while (count > 0) {
                    prev.append(str);
                    count--;
                }

                str = prev;
            }

            else {
                str.append(ch);
            }
        }

        return str.toString();
    }
}