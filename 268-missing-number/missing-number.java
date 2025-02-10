class Solution {
    public int missingNumber(int[] nums) {
        int ans=-1;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){               
            ans = i;
            break;
            }
         if(ans==-1){
            ans=nums.length;
         }        
             
        }
        return ans;
    }
}