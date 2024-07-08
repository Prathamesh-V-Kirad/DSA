class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        int j = 0;

        for(int i = 0 ; i < k ; i++){
            avg += nums[i];
        }
        
        double curr_avg = avg;
        
        for(int i = k ; i < nums.length ; i++){
            curr_avg = curr_avg + nums[i] - nums[j];
            avg = Math.max(avg,curr_avg);
            j++;
        }
        return avg/k;
    }
}