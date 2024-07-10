class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                common.add(num);
            } else {
                set2.add(num);
            }
        }

        set1.removeAll(common);
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(set1));
        result.add(new ArrayList<>(set2)); 
        
        return result;
    }
}