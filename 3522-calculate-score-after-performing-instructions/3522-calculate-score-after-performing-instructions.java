class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long res = 0;
        Set<Integer> s = new HashSet<>();
        int n = values.length,i = 0;
        while(i>-1 && i<n){
            if(s.contains(i))
                break;
            if(instructions[i].equals("add")){
                res += values[i];
                s.add(i);
                i++;
            }
            else{
                s.add(i);
                if(values[i]==0)
                    break;
                else
                    i += values[i];
            }
        }
        return res;
    }
}