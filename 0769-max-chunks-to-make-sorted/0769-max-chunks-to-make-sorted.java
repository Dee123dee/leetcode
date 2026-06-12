class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sum=0;
        int p=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            p=p+i;
            if(sum==p){
                count++;
            }
        }
        return count;
    }
}