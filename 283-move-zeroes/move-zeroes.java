class Solution {
    public void moveZeroes(int[] nums) {
       int index=0;
       int k = nums.length;
       for(int i=0; i<nums.length; i++){
        if(nums[i]!=0){
        nums[index]=nums[i];
        index++;
       }
       }
       
       for(int j=index; j< nums.length; j++ ){
        nums[index]=0;
        index++;
       }
       
    }
}