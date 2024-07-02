import java.util.* ;

import javax.sound.midi.MidiFileFormat;

import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        long[] temp = new long[n];
        return mergeSortAndCount(arr, temp, 0, n - 1);
    }
    private static long mergeSortAndCount(long[] arr, long[] temp, int left, int right) {
        long invCount = 0;
        if (right > left) {
            int mid = (right + left) / 2;
            invCount += mergeSortAndCount(arr, temp, left, mid);
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);
            invCount += mergeAndCount(arr, temp, left, mid + 1, right);
        }
        return invCount;
    }

    private static long mergeAndCount(long[] arr, long[] temp, int left, int mid, int right) {
        int i = left;    
        int j = mid;    
        int k = left;   
        long invCount = 0;

        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i);
            }
        }

        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

}


//Uses modified version of merge sort