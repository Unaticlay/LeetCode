// Dynamic programming, idea is that we know when is the best time to buy and sell for n days, so the best time to buy
// and sell is either 
//        best time to buy and sell for n days
// or
//        best time to sell and n+1 days and a lowest day to buy before n + 1
// 1ms, 36.7mb
public int maxProfit(int[] prices) {
        if ((prices.length == 0) || (prices.length == 1))
            return 0;
        
        int buy = 0;
        int[] dp = new int[prices.length];
        dp[0] = 0;
        if (prices[1] > prices[0])
        {
            dp[1] = prices[1] - prices[0];
        }
        else
            buy = 1;
        
        for (int i = 2; i < prices.length; i ++)
        {
            dp[i] = Math.max(dp[i - 1], prices[i] - prices[buy]);
            if (prices[i] < prices[buy])
                buy = i;
        }
        
        return dp[prices.length - 1];
    }
