// Last updated: 8/1/2025, 2:41:28 PM
class Solution {
  public String reverseVowels(String s) {
    StringBuilder str = new StringBuilder(s);
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      while (l < r && !isVowel(str.charAt(l)))
        ++l;
      while (l < r && !isVowel(str.charAt(r)))
        --r;
      str.setCharAt(l, s.charAt(r));
      str.setCharAt(r, s.charAt(l));
      ++l;
      --r;
    }

    return str.toString();
  }

  private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
  }
}