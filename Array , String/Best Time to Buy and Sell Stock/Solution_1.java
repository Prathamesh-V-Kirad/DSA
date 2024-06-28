class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n ;i++){
            if(prices[i] < min){
                min = prices[i];
            } 
            max = max > (prices[i]-min) ? max : (prices[i]-min);
            if(max < 0){
                max = 0;
            }
        }
        return max;
    }
}

/*
Runtime 1ms
Memory  61.15MB
 */