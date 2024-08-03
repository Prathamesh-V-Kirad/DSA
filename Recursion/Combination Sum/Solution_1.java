class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int remaining, int start) {
        if (remaining == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (remaining < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(result, temp, candidates, remaining - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}