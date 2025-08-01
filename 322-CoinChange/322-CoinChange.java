// Last updated: 8/1/2025, 2:41:31 PM
class Solution {
  public int coinChange(int[] coins, int amount) {
    int[] arr = new int[amount + 1];
    Arrays.fill(arr, 1, arr.length, amount + 1);

    for (final int coin : coins)
      for (int i = coin; i <= amount; ++i)
        arr[i] = Math.min(arr[i], arr[i - coin] + 1);

    return arr[amount] == amount + 1 ? -1 : arr[amount];
  }
}