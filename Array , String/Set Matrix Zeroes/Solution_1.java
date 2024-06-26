class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<Integer>();
        ArrayList<Integer> cols = new ArrayList<Integer>();
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
                if(cols.contains(j) || rows.contains(i)){
                    matrix[i][j] = 0;
                }
            }
        }
        if(!rows.isEmpty()){
            for(int i = 0 ; i < matrix.length ; i++){
                for(int j = 0 ; j < matrix[0].length;j++){
                    if(cols.contains(j) || rows.contains(i)){
                        matrix[i][j] = 0;
                    }
                    if (cols.get(0) == j && rows.get(0) == i){
                        break;
                    }
                }
            }   
        }
    }
}


/*
Runtime 36ms
Memory  45.73MB
*/