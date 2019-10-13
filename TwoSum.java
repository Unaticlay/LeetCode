// Brute Force, 18ms, 37.5mb
public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i ++)
        {
            for (int j = i + 1; j < nums.length; j ++)
            {
                if ((nums[i] + nums[j]) == target)
                    return new int[] {i,j};
            }
        }
        
        return new int[]{};
    }


// Using hash table, 2ms, 38.2mb
public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++)
        {
            int min = Math.min(target - nums[i], nums[i]);
            if (!map.containsKey(min))
                map.put(min, i);
            else if ((nums[map.get(min)] + nums[i]) == target)
                return new int[] {map.get(min), i};
        }
        
        return new int[]{};
    }
