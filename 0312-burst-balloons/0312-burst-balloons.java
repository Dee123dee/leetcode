class Solution {
    public int maxCoins(int[] nums) {
        int[] arr = new int[nums.length + 2];
        for(int i = 1; i < arr.length - 1; i++){
            arr[i] = nums[i - 1];
        }
        arr[0] = 1;
        arr[arr.length - 1] = 1;
        int[][] dp = new int[arr.length][arr.length];
        return burstBalloons(arr, arr.length - 1, dp);
    }
    public int burstBalloons(int[] arr, int n, int[][] dp){
        for(int gap = 2; gap < arr.length; gap++){
            for(int s = 0; s <= arr.length - 1 - gap; s++){
                int e = s + gap;
                int ans = Integer.MIN_VALUE;
                for(int i = s + 1; i < e; i++){
                    int myans = dp[s][i] + dp[i][e] + arr[s] * arr[i] * arr[e];
                    ans = Math.max(myans, ans);
                }
                dp[s][e] = ans;
            }
        }
        return dp[0][arr.length - 1];
    }
}