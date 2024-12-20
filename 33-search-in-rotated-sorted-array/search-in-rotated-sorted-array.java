class Solution {
    public int search(int[] nums, int target) {
        int l = 0;                 //intitializing left and right index
        int r = nums.length -1;   
        
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            } 

            //find out which half is sorted

            //for if left half is sorted
            if(nums[l] <= nums[mid]){
                if(target >= nums[l] && target < nums[mid]){
                r= mid - 1;
                }else {
                l= mid + 1;
                }
            }
            //for if right half is sorted
            else{
                if(target > nums[mid] && target <= nums[r]){
                l= mid + 1;
                }else{
                r= mid - 1;
                }
            }
        }
      return -1;   //if not found
    }
}