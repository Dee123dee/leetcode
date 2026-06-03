class Solution {
    private static boolean check(String s,char[] ch,char[] chars)
    {
        for(char c : s.toCharArray())
        {
            ch[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(chars[i]<ch[i])
            {
                return false;
            }
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        char[] chars1 = new char[26];
        for(char c : chars.toCharArray())
        {
            chars1[c-'a']++;
        }
        int total=0;
        for(int i=0;i<words.length;i++)
        {
            if(check(words[i],new char[26],chars1))
            {
                total+=words[i].length();
            }
        }
        return total;
    }
}