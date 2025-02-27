class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int j=0;
        int[]res= new int[nums.length-k+1];
        ArrayDeque<Integer> queue= new ArrayDeque();
        for(int i=0; i<nums.length; i++){
            while(!queue.isEmpty() && nums[queue.getLast()] < nums[i]){
                queue.removeLast();
            }
            queue.addLast(i);
            if(queue.getFirst()+k == i)
            queue.removeFirst();
            if(i>=k-1)
                res[j++]=nums[queue.getFirst()];
        }
       return res;
} 
    }