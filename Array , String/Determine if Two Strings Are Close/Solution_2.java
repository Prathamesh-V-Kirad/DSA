class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        boolean[] chars1 = new boolean[26];
        boolean[] chars2 = new boolean[26];

        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            count1[c1 - 'a']++;
            count2[c2 - 'a']++;
            chars1[c1 - 'a'] = true;
            chars2[c2 - 'a'] = true;
        }

        if (!Arrays.equals(chars1, chars2)) {
            return false;
        }

        Arrays.sort(count1);
        Arrays.sort(count2);
        
        return Arrays.equals(count1, count2);
    }
}