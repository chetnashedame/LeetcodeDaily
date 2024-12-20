class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = startingPosition(nums, target);
        int last = endingPosition(nums, target);
        return new int[]{first, last};
    }
     private int startingPosition(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int result = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                result = mid;
                r=mid-1;
            }else if(nums[mid] < target){
                l=mid+1;
            }else
                r=mid-1;
        }
        return result;
}

    private int endingPosition(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;
        int result = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                result = mid;
                l=mid+1;
            }else if(nums[mid] < target){
                l=mid+1;
            }else
                r=mid-1;
        }
        return result;
    }
    
}