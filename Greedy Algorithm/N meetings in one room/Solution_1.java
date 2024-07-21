class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int[][] meetings = new int[n][2];
        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }

        Arrays.sort(meetings, Comparator.comparingInt(a -> a[1]));
        
        int count = 1; 
        int lastEndTime = meetings[0][1];
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] > lastEndTime) {
                count++;
                lastEndTime = meetings[i][1];
            }
        }

        return count;
    }
}