// Last updated: 8/1/2025, 2:41:46 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1;  i < nums.length; i++){
            if (nums[i] !=nums[j]){
                j++;
            }
            nums[j] = nums[i];

        }
        return j+1;
    }
}