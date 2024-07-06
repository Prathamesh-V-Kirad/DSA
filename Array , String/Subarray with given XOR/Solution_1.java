public class Solution {
    public int solve(int[] A, int B) {
        int prefixXor = 0;
        int count = 0; 
        Map<Integer, Integer> freq = new HashMap<>(); 
        freq.put(0, 1);
        for (int num : A) {
            prefixXor ^= num;
            if (freq.containsKey(prefixXor ^ B)) {
                count += freq.get(prefixXor ^ B); 
            }
            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
        }
        return count;  
    }
}

