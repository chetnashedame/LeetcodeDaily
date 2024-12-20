class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m =matrix.length;
        int n = matrix[0].length;
        
        for(int [] row : matrix){
        int l = 0; int r = n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            
            if(row[mid]==target){
                return true;
            }else if(row[mid]< target){
                l=mid+1;
            }else
                r=mid-1;
                
        }
        }
        return false;
    }
}