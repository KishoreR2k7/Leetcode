class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
    public static void reverse(int[] arr){
        int left=0,rigth=arr.length-1;
        while(left<rigth){
            int temp=arr[left];
            arr[left]=arr[rigth];
            arr[rigth]=temp;
            left++;
            rigth--;
        }
    }
}