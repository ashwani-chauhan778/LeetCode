// Last updated: 8/1/2025, 2:41:32 PM
bool isBadVersion(int version);

class Solution {
 public:
  int firstBadVersion(int n) {
    int l = 1;
    int r = n;

    while (l < r) {
      const int m = l + (r - l) / 2;
      if (isBadVersion(m))
        r = m;
      else
        l = m + 1;
    }

    return l;
  }
};