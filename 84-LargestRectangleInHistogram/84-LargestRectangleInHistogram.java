// Last updated: 8/1/2025, 2:41:41 PM
class Solution {
  public int largestRectangleArea(int[] h) {
    int r = 0;
    var s = new ArrayDeque<Integer>();
    for (int i = 0; i <= h.length; i++) {
      int x = (i == h.length) ? 0 : h[i];
      while (!s.isEmpty() && h[s.peek()] > x)
        r = Math.max(r, h[s.pop()] * (s.isEmpty() ? i : i - s.peek() - 1));
      s.push(i);
    }
    return r;
  }
}
