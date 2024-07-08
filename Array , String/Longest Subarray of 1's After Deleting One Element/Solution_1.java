class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int max = 0;
        int k = 0;
        for(int r = 0 ; r < nums.length ; r++){
            if(nums[r] == 0){
                k++;
            }
            while( k > 1){
                if(nums[l] == 0){
                    k--;
                }
                l++;
            }
            max = Math.max(max , r-l);
        }
        return max;
    }
}