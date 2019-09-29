// Dynamic programming, the basic idea is that depends on the range, 1,2,4,8... the current position copy the [i-range] and + 1
public int[] countBits(int num) {
        if (num == 0)
            return new int[] {0};
        
        int[] dp = new int[num + 1];
        
        dp[0] = 0;
        dp[1] = 1;
        int current = 2;
        for (int i = 2; i < num + 1; i ++)
        {
            if (i == (current * 2))
                current *= 2;
            
            dp[i] = dp[i - current] + 1;
        }
        
        return dp;
    }
