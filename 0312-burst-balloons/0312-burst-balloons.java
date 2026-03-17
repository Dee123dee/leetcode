class Solution {
    int[][] dp;
int[] arr;
public int maxCoins(int[] nums) {
    int n = nums.length;
    arr = new int[n + 2];
    // Step 1: Create new array with boundaries
    for(int i = 1; i <= n; i++){
        arr[i] = nums[i - 1];
    }
    arr[0] = 1;
    arr[n + 1] = 1;
    
    dp = new int[arr.length][arr.length];
    // Solve for the entire array (from boundary 0 to boundary n+1)
    return coins(0, arr.length - 1);
}

private int coins(int i, int j){
    // Base Case: No balloons between i and j
    if(i + 1 == j){
        return 0;
    }
    // Memoization check
    if(dp[i][j] != 0){
        return dp[i][j];
    }
    int maxCost = Integer.MIN_VALUE;
    // Try every balloon k in (i, j) as the last burst
    for(int k = i + 1; k < j; k++){
        // Recursively solve left and right, then add the last burst cost.
        maxCost = Math.max(coins(i, k) + coins(k, j) + arr[i] * arr[k] * arr[j], maxCost);
    }
    // Store the result and return
    return dp[i][j] = maxCost;
}
}