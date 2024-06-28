class Solution {
    public int maxSubArray(int[] nums) {
       int sum = 0;
       int max = Integer.MIN_VALUE;
       for(int num : nums){
            sum += num;
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
       }   
       return max;
    }
}


/*
Runtime 1ms
Memory  57.08MB
*/