class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            num+=(s.charAt(i) - 'A' )+1;
            num = num * 26;
        }
        return num+(s.charAt(s.length()-1)-'A'+1);
    }
}