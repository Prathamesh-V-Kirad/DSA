class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] merged = new int[intervals.length][2];
        int mergedIndex = 0;
        merged[0] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= merged[mergedIndex][1]) {
                merged[mergedIndex][1] = Math.max(merged[mergedIndex][1], intervals[i][1]);
            } else {
                mergedIndex++;
                merged[mergedIndex] = intervals[i];
            }
        }
        return Arrays.copyOf(merged, mergedIndex + 1);
    }
}