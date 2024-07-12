class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }else{
            Map<Character, Integer> count1 = new HashMap<>();
            Map<Character, Integer> count2 = new HashMap<>();
            for(char c : word1.toCharArray()){
                count1.put(c , count1.getOrDefault(c, 0) + 1);
            }
            for(char c : word2.toCharArray()){
                count2.put(c , count2.getOrDefault(c, 0) + 1);
            }
            if (!count1.keySet().equals(count2.keySet())) {
                return false;
            }
            List<Integer> values1 = new ArrayList<>(count1.values());
            List<Integer> values2 = new ArrayList<>(count2.values());
            Collections.sort(values1);
            Collections.sort(values2);

            return values1.equals(values2);
        }
    }
}