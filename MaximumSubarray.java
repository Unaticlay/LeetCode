// 51ms 39.8mb
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
