class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] seen = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(seen[nums[i]] != false) {
                return nums[i];
            }
            seen[nums[i]] = true;
        }
        return -1;
    }
}

/*
Runtime 1ms
Memory  57.84
 */