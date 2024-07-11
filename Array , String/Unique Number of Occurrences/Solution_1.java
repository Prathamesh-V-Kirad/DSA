class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        Set<Integer> seen = new HashSet<>();
        for (int cnt : count.values()) {
            if (!seen.add(cnt)) {
                return false; 
            }
        }
        return true;
    }
}