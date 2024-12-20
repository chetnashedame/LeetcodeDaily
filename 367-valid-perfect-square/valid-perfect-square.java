class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int r=num/2;
        if(num==1)
            return true;
        while(l<=r){
            int mid = l+(r-l)/2;
            if((long)mid*mid == num){
                return true;
            }else if((long)mid*mid < num){
                l=mid+1;
            }else
                r=mid-1;
        }
        return false;
    }
}