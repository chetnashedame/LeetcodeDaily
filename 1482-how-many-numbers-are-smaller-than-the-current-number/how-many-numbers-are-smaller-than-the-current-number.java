class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []ans=new int[nums.length];
        int [] arr= Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        // Create a map to store the count of smaller numbers
    for (int i = 0; i < nums.length; i++) {
        // Find the index of the current number in the sorted array
        ans[i] = findIndex(arr, nums[i]);
    }
    
    return ans;
    }

// Helper method to find the index of the first occurrence of a number
private int findIndex(int[] arr, int num) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == num) {
            return i; // Return the index, which is the count of smaller numbers
        }
    }
    return 0; // In case the number is not found, return 0
    
}
    }