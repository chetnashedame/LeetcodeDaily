class Solution {
    public int maximumSum(int[] nums) {
        int res=-1;
        Map<Integer, Integer> map= new HashMap();
       
        for(int i=0; i<nums.length; i++){
             int s=sum(nums[i]);
            if(map.containsKey(sum(nums[i]))){
            res=Math.max(res, nums[i]+map.get(s));
            
            if(nums[i] > map.get(s)){
            map.put(s, nums[i]);
            }
            }
            else
            map.put(s, nums[i]);

        }
        return res;
    }        public int sum(int n){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            return sum;
        }
    
}