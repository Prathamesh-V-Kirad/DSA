class Solution {
    public void setZeroes(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        boolean[] rowval= new boolean[row];
        boolean[] colval= new boolean[col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==0)
                {
                    rowval[i]=true;
                    colval[j]=true;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(rowval[i]||colval[j])
                {
                    mat[i][j]=0;
                }
            }
        }
        
    }
}

/*
Runtime 1ms
Memory  45.30MB
*/