// Last updated: 8/1/2025, 2:41:43 PM
class Solution {
  public int climbStairs(int n) {
    int p1 = 1; 
    int p2 = 1; 

    for (int i = 2; i <= n; ++i) {
      final int dp = p1 + p2;
      p2 = p1;
      p1 = dp;
    }

    return p1;
  }
}