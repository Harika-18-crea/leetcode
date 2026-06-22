class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(target>matrix[i][matrix[0].length-1]){
                continue;
            }
            else{
                int l=0;
                int h=matrix[i].length-1;
                while(l<=h){
                    int m=(l+h)/2;
                    if(target==matrix[i][m]){
                        return true;
                    }
                    else if(target>matrix[i][m]){
                        l=m+1;
                    }
                    else{
                        h=m-1;
                    }
                }
            }
        }
        return false;
    }
}