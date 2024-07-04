class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int sequence = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) { 
                int currentNum = num;
                int currentSeq = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSeq += 1;
                }

                sequence = Math.max(sequence, currentSeq);
            }
        }

        return sequence;
    }
}