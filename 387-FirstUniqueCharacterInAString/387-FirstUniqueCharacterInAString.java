// Last updated: 8/1/2025, 2:41:26 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] frequency = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            frequency[s.charAt(i) - 'a']++;
        }        
        for (int i = 0; i < n; i++) {
            if (frequency[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}