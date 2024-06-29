class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];
        for(int i=0; i<n ;i++){
            if(prices[i] < min){
                min = prices[i];
            } else{
                max = max > (prices[i]-min) ? max : (prices[i]-min);
            }
        }
        return max;
    }
}



/*
Runtime 1ms
Memory  61.15MB
 */