class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int mid= (l+r)/2;
        
            if(nums[r]<nums[mid]){
                l=mid+1; 
            } else if(nums[l]>nums[mid]){
                r=mid;
            } else
                r--;
        }
        return nums[l];
        
    }
}