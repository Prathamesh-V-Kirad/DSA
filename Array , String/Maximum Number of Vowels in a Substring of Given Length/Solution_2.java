class Solution {
    public int maxVowels(String s, int k) {
        char[] charSet = new char[256];
        for (char c: new char[]{'a','e','i','o','u'}) {
            charSet[c] = 1;
        }
        int count = 0;
        int i = 0;
        int j = 0;
        while(j < k){
            count += charSet[s.charAt(j)];
            j++;
        }
        int max = count;
        while(j < s.length()) {
            count = count - charSet[s.charAt(i)] + charSet[s.charAt(j)];
            i++;
            j++;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}