class Solution {
    public String reverseParentheses(String s) {
        Stack<Character>st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(char ch : s.toCharArray())
        {
            if(ch==')')
            {
                String se = "";
                while(st.peek()!='(')
                {
                    se = se+st.pop();
                }
                st.pop();

                for(char c : se.toCharArray())
                {
                    st.push(c);
                }
            }
            else
            {
                st.push(ch);
            }
        }
        String res = "";
        while(!st.isEmpty())
        {
            System.out.print(st.peek()+" ");
            sb.append(st.pop());
        }
        String result = sb.reverse().toString();
        return result;
    }
}