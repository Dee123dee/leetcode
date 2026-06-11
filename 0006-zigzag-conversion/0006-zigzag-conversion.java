class Solution {
    public String convert(String s, int num) {
        if(num==1 || num>s.length()){
            return s;
        }
        
        List<StringBuilder>res=new ArrayList<>();
        for(int i=0;i<num;i++){
            res.add(new StringBuilder());
        }
        int ind=0;
        int d=0;

        for(char c:s.toCharArray()){
            res.get(ind).append(c);

            if(ind==0){
                d=1;
            }else if(ind==num-1){
               d=-1;
            }

            ind+=d;
        }

        StringBuilder ans=new StringBuilder();

        for(StringBuilder str:res){
            ans.append(str);
        }

        return ans.toString();
    }
}