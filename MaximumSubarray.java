// Brute Force, 51ms 39.8mb
public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i ++)
        {
            int temp = 0;
            for (int j = i; j < nums.length; j ++)
            {
                temp += nums[j];
                if (temp > max)
                    max = temp;
            }
        }
        
        return max;
    }


// Dynamic Programming, 1ms 37.4mb
public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < nums.length; i ++)
        {
            max = Math.max(max + nums[i], nums[i]);
            dp[i] = Math.max(max, dp[i - 1]);
        }
        
        return dp[nums.length - 1];
    }
