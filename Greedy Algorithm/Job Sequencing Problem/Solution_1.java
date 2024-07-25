class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;
        for (Job job : arr) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }
        int[] result = new int[maxDeadline + 1];
        Arrays.fill(result, -1);

        int countJobs = 0, maxProfit = 0;

        for (Job job : arr) {
            for (int j = job.deadline; j > 0; j--) {
                if (result[j] == -1) {
                    result[j] = job.id;
                    countJobs++;
                    maxProfit += job.profit;
                    break;
                }
            }
        }

        return new int[]{countJobs, maxProfit};
    }
}
