class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int maxLength = Math.max(word1.length(), word2.length());
         for(int i = 0 ; i < maxLength ; i ++) {
            if(word1.length() > i){
                result += word1.charAt(i);
            }
            if(word2.length() > i) {
                result += word2.charAt(i);
            }
        }
        return result;
    }
}

/*
Runtime  7 ms
Memory   42.6 MB
*/