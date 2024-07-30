class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        for (int num : arr) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                result.add(result.get(i) + num);
            }
        }

        return result;
    }
}