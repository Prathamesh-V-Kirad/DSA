class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> ans = new ArrayList<>();
        int maxCandie = 0;
        for (int candy : candies) {
            if (candy > maxCandie) {
                maxCandie = candy;
            }
        }
        for(int candy: candies){
            if( (candy+extraCandies) >= maxCandie){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}

/*
Runtime 1ms
Memory  42.32MB
*/