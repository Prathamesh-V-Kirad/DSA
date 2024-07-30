class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        findSubsetSums(arr, n, 0, 0, result);
        return result;
    }
    
    private void findSubsetSums(ArrayList<Integer> arr, int n, int index, int currentSum, ArrayList<Integer> result) {
        if (index == n) {
            result.add(currentSum);
            return;
        }
        findSubsetSums(arr, n, index + 1, currentSum + arr.get(index), result);
        findSubsetSums(arr, n, index + 1, currentSum, result);
    }
}