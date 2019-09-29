// Dynamic programming, the idea is that for every n stairs, it is either F(N-2) + 2 or F(N-1) + 1, 0ms, 32.2mb
public int climbStairs(int n) {
        if ((n == 0) || (n == 1))
            return 1;
        else if (n == 2)
            return 2;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i ++)
            dp[i] = dp[i - 1] + dp[i - 2];
        
        return dp[n];
    }
