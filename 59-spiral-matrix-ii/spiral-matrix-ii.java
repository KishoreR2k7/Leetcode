class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int rigth=n-1;
        int m=1;
        while(top<=bottom && left<=rigth){
            for(int i=left;i<=rigth;i++){
                matrix[top][i]=m;
                m++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][rigth]=m;
                m++;
            }
            rigth--;
            if(top<=bottom){
                for(int i=rigth;i>=left;i--){
                    matrix[bottom][i]=m;
                    m++;
                }
                bottom--;
            }
            if(left<=rigth){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left]=m;
                    m++;
                }
                left++;
            }
        }
        return matrix;
    }
}