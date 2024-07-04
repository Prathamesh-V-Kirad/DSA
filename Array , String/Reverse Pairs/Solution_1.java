class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return (int) mergeSortAndCount(nums, 0, nums.length - 1);
    }

    private static long mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        long count = mergeSortAndCount(arr, left, mid) + mergeSortAndCount(arr, mid + 1, right);
        count += mergeAndCount(arr, left, mid, right);
        return count;
    }

    private static long mergeAndCount(int[] arr, int left, int mid, int right) {
        int j = mid + 1;
        long count = 0;
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        int[] temp = new int[right - left + 1];
        int i = left;
        j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, 0, arr, left, temp.length);

        return count;
    }
}
