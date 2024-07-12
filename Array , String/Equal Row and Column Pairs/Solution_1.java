class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        Map<String, Integer> colMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringBuilder rowStr = new StringBuilder();
            StringBuilder colStr = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                rowStr.append(grid[i][j]).append(",");
                colStr.append(grid[j][i]).append(",");
            }
            
            String rowKey = rowStr.toString();
            String colKey = colStr.toString();
            
            rowMap.put(rowKey, rowMap.getOrDefault(rowKey, 0) + 1);
            colMap.put(colKey, colMap.getOrDefault(colKey, 0) + 1);
        }
        
        int count = 0;
        for (String rowKey : rowMap.keySet()) {
            if (colMap.containsKey(rowKey)) {
                count += rowMap.get(rowKey) * colMap.get(rowKey);
            }
        }
        
        return count;
    }
}