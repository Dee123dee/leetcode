class Solution {
    public List<String> printVertically(String s) {
        String[] arr = s.split(" ");
        List<List<Character>> list = new ArrayList<>();
        int max = 0;

        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(arr[i].length(),max);
        }

        for(int i=0;i<max;i++)
        {
            list.add(new ArrayList<>());
        }

        for(String s1 : arr)
        {
            for(int i = 0;i<max;i++)
            {
                char ch = i < s1.length() ? s1.charAt(i) : '\0';
                list.get(i).add(ch);
            }
        }

        List<String>res = new ArrayList<>();
        for(List<Character> a : list)
        {
            StringBuilder sb = new StringBuilder();
            for(char ch : a)
            {
                if(ch!='\0')
                {
                    sb.append(ch);
                }
                else
                {
                    sb.append(' ');
                }
            }

            while(sb.length()>0 && sb.charAt(sb.length()-1) == ' ')
            {
                sb.deleteCharAt(sb.length()-1);
            }
            res.add(sb.toString());
        }

        return res;
    }
}