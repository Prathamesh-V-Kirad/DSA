class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platforms_needed = 1, max_platforms = 1;
        int i = 1, j = 0;
        
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms_needed++;
                i++;
            }
            else {
                platforms_needed--;
                j++;
            }
            if (platforms_needed > max_platforms)
                max_platforms = platforms_needed;
        }
        
        return max_platforms;
    }
    
}

