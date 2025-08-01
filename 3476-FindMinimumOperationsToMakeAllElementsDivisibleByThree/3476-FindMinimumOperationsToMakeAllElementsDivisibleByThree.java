// Last updated: 8/1/2025, 2:41:18 PM
class Solution {
    public int minimumOperations(int[] numbers) {
        int operationsCount = 0;
        for (int number : numbers) {
            int remainder = number % 3;
            if (remainder != 0) {
                operationsCount += Math.min(remainder, 3 - remainder);
            }
        }
        return operationsCount;
    }
}

