import java.util.*;

class Solution{

    PriorityQueue<Integer>small=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer>large=new PriorityQueue<>();
    HashMap<Integer,Integer>del=new HashMap<>();

    int smallSize=0;
    int largeSize=0;

    public double[]medianSlidingWindow(int[]nums,int k){

        int n=nums.length;
        double[]res=new double[n-k+1];

        for(int i=0;i<n;i++){

            add(nums[i]);

            if(i>=k){
                remove(nums[i-k]);
            }

            if(i>=k-1){
                res[i-k+1]=getMedian(k);
            }
        }

        return res;
    }

    void add(int num){

        if(small.isEmpty()||num<=small.peek()){
            small.offer(num);
            smallSize++;
        }
        else{
            large.offer(num);
            largeSize++;
        }

        balance();
    }

    void remove(int num){

        del.put(num,del.getOrDefault(num,0)+1);

        if(num<=small.peek()){
            smallSize--;
            if(num==small.peek()){
                prune(small);
            }
        }
        else{
            largeSize--;
            if(!large.isEmpty()&&num==large.peek()){
                prune(large);
            }
        }

        balance();
    }

    void balance(){

        if(smallSize>largeSize+1){
            large.offer(small.poll());
            smallSize--;
            largeSize++;
            prune(small);
        }

        else if(smallSize<largeSize){
            small.offer(large.poll());
            smallSize++;
            largeSize--;
            prune(large);
        }
    }

    void prune(PriorityQueue<Integer>heap){

        while(!heap.isEmpty()){

            int num=heap.peek();

            if(del.containsKey(num)){

                del.put(num,del.get(num)-1);

                if(del.get(num)==0){
                    del.remove(num);
                }

                heap.poll();
            }

            else{
                break;
            }
        }
    }

    double getMedian(int k){

        if(k%2==1){
            return small.peek();
        }

        return ((double)small.peek()+large.peek())/2;
    }
}