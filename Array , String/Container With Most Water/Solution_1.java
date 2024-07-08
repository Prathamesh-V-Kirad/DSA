class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int i = 0;
        int j = n - 1;
        while( i < j){
            max = Math.max(max,((j-i)*(Math.min(height[i],height[j]))));
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}