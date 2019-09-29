// Dynamic Programming, 1ms 42.7mb
public int minCostClimbingStairs(int[] cost) {
        if((cost == null) || (cost.length == 0))
            return 0;
        else if (cost.length == 1)
            return 0;
        
        int[] dp = new int[cost.length + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for (int i = 2; i < cost.length; i ++)
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        
        int i = cost.length;
        dp[i] =Math.min(dp[i - 1] + 0, dp[i - 2] + 0);
        
        return dp[cost.length];
    }
