class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n =nums.length;
        int [] res = new int[n];
        Arrays.fill(res, -1);
        long win = 0;
        int kk= k;
        int idx = 2*k+1;
        if(idx>n){
            return res;
        }
            for(int i=0; i<idx; i++){
                win +=nums[i];

            }
        res[kk]=(int)(win/idx);
        for(int i=idx; i< n; i++){
                win = win - nums[i-idx] + nums[i];

            
        res[++k]=(int)(win/idx);
    }
    return res;

        
    }
}