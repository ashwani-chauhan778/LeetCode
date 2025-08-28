// Last updated: 8/28/2025, 3:14:07 PM
class Solution {
  public int[][] sortTheStudents(int[][] score, int k) {
    Arrays.sort(score, Comparator.comparingInt(a -> - a[k]));
    return score;
  }
}