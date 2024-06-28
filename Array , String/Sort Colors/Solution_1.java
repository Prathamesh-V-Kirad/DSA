class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int pivot = 0;
        int high = nums.length-1;
        while( pivot <= high){
            if(nums[pivot] == 0){
                swap(nums,low,pivot);
                pivot++;
                low++;
            }else if(nums[pivot] == 2){
                swap(nums,pivot,high);
                high--;
            }else{
                pivot++;
            }
        }
    }
    public void swap(int[] nums , int i , int j){
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*
 Runtime 0ms
 Memory  41.49MB
 */