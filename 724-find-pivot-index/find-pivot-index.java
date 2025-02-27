class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            // Right sum is totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Found the pivot index
            }
            leftSum += nums[i]; // Update leftSum for the next iteration
        }

        return -1; // No pivot index found
    }
    
}