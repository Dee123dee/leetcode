class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i]))
                h.put(nums[i],1);
            else
                h.put(nums[i],h.get(nums[i])+1);
        }
        while(true){
            List<Integer> l = new ArrayList<>();
            boolean flag = false;
            for(Map.Entry<Integer,Integer> temp: h.entrySet()){
                if(temp.getValue()>0){
                    flag=true;
                    l.add(temp.getKey());
                    h.put(temp.getKey(),h.get(temp.getKey())-1);
                }
            }
            if(flag==false)
                break;
            res.add(l);
        }
        return res;
    }
}