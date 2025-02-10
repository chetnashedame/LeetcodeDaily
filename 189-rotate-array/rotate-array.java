class Solution {
    public void rotate(int[] nums, int k) {
       k=k%nums.length;
        int arr[]=new int [nums.length];  
        int index=0;
        for(int i=nums.length-k ; i<nums.length ; i++){
            arr[index] = nums[i];
            index++;
        }
        for(int i=0;i<nums.length-k;i++){
            arr[index]=nums[i];
            index++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
}