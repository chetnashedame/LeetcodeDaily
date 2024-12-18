class Solution {
    public int countPairs(List<Integer> nums, int target) {
        nums.sort((a,b) -> a-b);
        int res=0;
        int l = 0;
        int r = nums.size()-1;
        while(l!=r){
            if(nums.get(l) + nums.get(r) < target){
                res += r-l;
                l++;
            }else {
                r--;
            }
        }
    return res;
        
    }
}