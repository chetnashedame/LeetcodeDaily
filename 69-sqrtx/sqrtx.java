class Solution {
    public int mySqrt(int x) {
        int l=1;        
        int r=x/2;
        if(x==1)
            return x;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(x==(long)mid*mid){
                return mid;
            }else if((long)mid*mid < x){
                l=mid+1;
            }else
                r=mid-1;
        }
        return r;
        
    }
}