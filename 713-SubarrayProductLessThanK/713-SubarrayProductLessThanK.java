// Last updated: 8/1/2025, 2:41:24 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0; 
        for (int start = 0, end = 0, product = 1; end < nums.length; end++) {
            product *= nums[end];
            while (start <= end && product >= k) {
                product /= nums[start++];
            }
            count += end - start + 1;
        }
        return count;
    }
}