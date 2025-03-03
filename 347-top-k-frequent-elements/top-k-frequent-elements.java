class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res= new int[k];
        Map<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
                map.put(i,map.getOrDefault(i,0)+1);
        }
            
        
        List<Integer>[] buckets=new List[nums.length+1];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<>();
        }
        for(int i:map.keySet()){
            buckets[map.get(i)].add(i);
        }
        List<Integer>temp=new ArrayList<>();
        for(int i=buckets.length-1;i>=0;i--){
            List<Integer> list=buckets[i];
            for(int j:list){
                temp.add(j);
            }
            }
            while(k-->0){
                res[k]=temp.get(k);
            }
        return res;
        
    }
}