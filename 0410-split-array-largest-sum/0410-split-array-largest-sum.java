class Solution {
    public int splitArray(int[] nums, int k) {
        
        int n = nums.length;
        
        int[] prefix = new int[n+1];
        
        for(int i=1;i<=n;i++)
        {
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        
        int[][] dp = new int[n+1][k+1];
        
        for(int i=1;i<=n;i++)
        {
            dp[i][1] = prefix[i];
        }
        
        for(int j=2;j<=k;j++)
        {
            for(int i=1;i<=n;i++)
            {
                dp[i][j] = Integer.MAX_VALUE;
                
                for(int p=0;p<i;p++)
                {
                    int largest = Math.max(dp[p][j-1], prefix[i]-prefix[p]);
                    
                    dp[i][j] = Math.min(dp[i][j], largest);
                }
            }
        }
        
        return dp[n][k];
    }
}