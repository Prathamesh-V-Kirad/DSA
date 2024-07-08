class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for(int i = 0 ; i < k ; i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }
        }
        int temp_cnt = count;
        for(int i = k ; i < s.length() ; i++){
            if(vowels.contains(s.charAt(i))){
                temp_cnt++;
            }
            if(vowels.contains(s.charAt(i-k))){
                temp_cnt--;
            }
            count = Math.max(count,temp_cnt);
        }
        return count;
    }
}