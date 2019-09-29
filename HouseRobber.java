// Dynamic programming, very similar to coin row problem, the idea is either rob the nth house or not
// 0ms, 34.4mb
public int rob(int[] nums) {
        if ((nums == null) || (nums.length == 0))
            return 0;
        else if (nums.length == 1)
            return nums[0];
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i < nums.length; i ++)
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        
        return dp[nums.length - 1];
    }
