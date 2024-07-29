class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int contentNo = 0;
        int j = 0;
        
        while (contentNo < g.length && j < s.length) {
            if (s[j] >= g[contentNo]) {
                contentNo++;
            }
            j++;
        }
        
        return contentNo;
    }
}