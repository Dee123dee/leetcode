class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> s1=new HashSet<>();
        Set<String>r1=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String cur=s.substring(i,i+10);
            if(s1.contains(cur))
            {
                r1.add(cur);
            }
            else
            {
                s1.add(cur);
            } 
        }
        return new ArrayList<>(r1);
    }
}