import java.util.*;

class Solution{
    public int minOperations(int[]target,int[]arr){

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<target.length;i++){
            map.put(target[i],i);
        }

        ArrayList<Integer>list=new ArrayList<>();

        for(int num:arr){
            if(map.containsKey(num)){
                list.add(map.get(num));
            }
        }

        int[]dp=new int[list.size()];
        int size=0;

        for(int num:list){

            int i=Arrays.binarySearch(dp,0,size,num);

            if(i<0){
                i=-(i+1);
            }

            dp[i]=num;

            if(i==size){
                size++;
            }
        }

        return target.length-size;
    }
}