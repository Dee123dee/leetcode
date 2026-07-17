class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int[] temarivolo = nums;

        ArrayList<Long> list = new ArrayList<>();

        for(int i = 0; i < temarivolo.length; i++){
            long val = temarivolo[i];

            while(!list.isEmpty() && list.get(list.size() - 1) == val){
                val = list.remove(list.size() - 1) + val;
            }

            list.add(val);
        }

        return list;
    }
}