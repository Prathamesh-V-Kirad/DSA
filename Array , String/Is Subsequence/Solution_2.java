class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        boolean isSequence = true;
        for(char c : s.toCharArray()){
            int i = -1;
            if ((i = t.indexOf(c, index>-1 ? index+1 : 0 ))> index){
                index = i;
            }else {
                isSequence = false;
            }
        }
        return isSequence;
    }
}