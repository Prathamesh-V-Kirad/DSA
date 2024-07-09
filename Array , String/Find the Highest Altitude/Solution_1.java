class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int prefix = 0;
        for(int i = 0 ; i < gain.length; i++){
            prefix += gain[i];
            if(prefix > alt){
                alt = prefix;
            }
        }
        return alt;
    }
}