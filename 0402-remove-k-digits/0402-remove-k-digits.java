class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>s=new Stack<>();
        if(num.length()==k)
        {
            return "0";
        }
        for(char c : num.toCharArray())
        {
            while(!s.isEmpty() && s.peek()> c && k>0)
            {
                s.pop();
                k--;
            }
            s.push(c);
        }
        while (k > 0) {
            s.pop();
            k--;
        }

        String sb="";
        while(!s.isEmpty())
        {
            sb = s.pop()+sb;
        }

        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }
        String result = sb.substring(idx);
        return result.isEmpty() ? "0" : result;
    }
}