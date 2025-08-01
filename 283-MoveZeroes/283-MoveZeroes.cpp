// Last updated: 8/1/2025, 2:41:29 PM
class Solution {
 public:
  void moveZeroes(vector<int>& nums) {
    int i = 0;
    for (const int num : nums)
      if (num != 0)
        nums[i++] = num;

    while (i < nums.size())
      nums[i++] = 0;
  }
};