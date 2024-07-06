class GfG
{
    int maxLen(int arr[], int n)
    {

        Map<Integer, Integer> sumMap = new HashMap<>();
        int maxLen = 0;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum == 0) {
                maxLen = Math.max(maxLen, i + 1);
            }
            if (sumMap.containsKey(currentSum)) {
                maxLen = Math.max(maxLen, i - sumMap.get(currentSum));
            } else {
                sumMap.put(currentSum, i);
            }
        }
        
        return maxLen;
    }
}