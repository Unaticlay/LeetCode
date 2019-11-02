//Transform and conquer, 9ms, using string representation
public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else if ((x >= 0) && (x < 10))
            return true;
        
        String str = "" + x;
        int start = 0;
        int end = str.length() - 1;
        
        while (start <= end)
        {
            if (str.charAt(start) != str.charAt(end))
                return false;
            
            start ++;
            end --;
        }
        
        return true;
    }
    
// Brute force, 6 ms, reconstruct the number from the other side
public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        
        int temp = 0;
        int b = x;
        while (b > 0)
        {
            int mod = b % 10;
            temp = temp * 10 + mod;
            b /= 10;
        }
        
        if (temp == x)
            return true;
        
        return false;
    }
