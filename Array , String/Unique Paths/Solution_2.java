class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        return countPaths(0, 0, m, n, memo);
    }

    public int countPaths(int i, int j, int m, int n, int[][] memo) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (i >= m || j >= n) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        memo[i][j] = countPaths(i + 1, j, m, n, memo) + countPaths(i, j + 1, m, n, memo);
        return memo[i][j];
    }
}

//using memoization