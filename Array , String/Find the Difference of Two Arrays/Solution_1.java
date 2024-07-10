class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());
        for(int i : nums1){
            map.put(i,1);
        }   
        for(int j : nums2){
            if(!map.containsKey(j)){
                if(!result.get(1).contains(j)){
                    result.get(1).add(j);
                }
            }else{
                map.put(j, map.getOrDefault(j, 0) - 1);
            }
        }
        for (Integer key : map.keySet()) {
            if(map.get(key) == 1){
                result.get(0).add(key);
            }
        }
        return result;
    }
}