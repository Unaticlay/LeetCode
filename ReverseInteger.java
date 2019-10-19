// Brute force, 1ms
public int reverse(int x) {
        int number = 1;
        if (x < 0)
            number *= -1;
        x = Math.abs(x);
        
        long result = 0;
        while (x != 0)
        {
            result += (x % 10);
            x /= 10;
            if (x != 0)
                result *= 10;
        }
        
        result *= number;
        
        if ((result > Integer.MAX_VALUE) || (result < Integer.MIN_VALUE)) 
            return 0;
        
        return (int)result;
        
    }
