// Last updated: 8/1/2025, 2:41:38 PM
class Solution {
 public:
  void rotate(vector<int>& numbers, int k) {
    k %= numbers.size();
    reverse(numbers, 0, numbers.size() - 1);
    reverse(numbers, 0, k - 1);
    reverse(numbers, k, numbers.size() - 1);
  }

 private:
  void reverse(vector<int>& numbers, int l, int r) {
    while (l < r)
      swap(numbers[l++], numbers[r--]);
  }
};