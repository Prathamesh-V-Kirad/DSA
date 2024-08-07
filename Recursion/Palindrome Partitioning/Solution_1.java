class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> subsets = new ArrayList<>();
        backtrack(subsets, new ArrayList<>(), s, 0);
        return subsets;
    }

    private void backtrack(List<List<String>> subsets, List<String> temp, String s, int start) {
        if (start == s.length()) {
            subsets.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    temp.add(s.substring(start, i + 1));
                    backtrack(subsets, temp, s, i + 1);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
  
}