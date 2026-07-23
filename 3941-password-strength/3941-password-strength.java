class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> s = new HashSet<>();
        int sum = 0;
        for(char ch : password.toCharArray())
        {
            if(!s.contains(ch))
            {
                if(ch>='A' && ch<='Z')
                {
                    s.add(ch);
                    sum+=2;
                }
                else if(ch>='a' && ch<='z')
                {
                    s.add(ch);
                    sum+=1;
                }
                else if(ch>='0' && ch<='9')
                {
                    s.add(ch);
                    sum+=3;
                }
                else
                {
                    s.add(ch);
                    sum+=5;
                }
            }
        }
        return sum;
    }
}