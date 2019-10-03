// 2ms, 35.7mb
public int numDecodings(String s) {
        if (s.length() == 0)
            return 0;
        else if (s.length() == 1)
        {
            if (s.charAt(0) == '0')
                return 0;
            return 1;
        }
        else if (s.charAt(0) == '0')
            return 0;
        
        int[] number = new int[s.length()];
        for (int i = 0; i < s.length(); i ++)
            number[i] = Integer.parseInt("" + s.charAt(i));
        
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int count1 = 1;
        int count2 = 1;
        if ((number[1] != 0) && ((number[0] * 10 + number[1]) <= 26))
            count2 = 2;
        
        if ((number[1] == 0) && (number[0] > 2))
            return 0;
        
        dp[1] = 1;
        
        for (int i = 2; i < s.length(); i ++)
        {
            if ((number[i] != 0) && (number[i - 1] != 0) 
                && ((number[i - 1] * 10 + number[i]) <= 26))
            {
                int temp = count2;
                count2 += count1;
                count1 = temp;
                dp[i] = dp[i - 1];
            }
            else if (number[i] == 0)
            {
                if (number[i - 1] == 0)
                    return 0;
                else if (number[i - 1] * 10 > 20)
                    return 0;
                else
                {
                    if (count2 > 1)
                        dp[i] = dp[i - 1] * count1;
                    else
                        dp[i] = dp[i - 1] * count2;
                    count1 = 1;
                    count2 = 1;
                }
            }
            else
            {
                dp[i] = dp[i - 1] * count2;
                count1 = 1;
                count2 = 1;
            }
        }
        
        return dp[s.length() - 1] * count2;
            
    }
