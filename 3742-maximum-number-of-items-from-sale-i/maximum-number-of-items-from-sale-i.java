class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] val = new int[n];
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minPrice = Math.min(minPrice, items[i][1]);
            int freeCount = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % items[i][0] == 0) {
                    freeCount++;
                }
            }
            val[i] = 1 + freeCount;
        }
        int[] dp = new int[budget + 1];
        for (int i = 0; i < n; i++) {
            int price = items[i][1];
            int value = val[i];
            for (int b = budget; b >= price; b--) {
                dp[b] = Math.max(dp[b], dp[b - price] + value);
            }
        }
        int maxTotal = 0;
        for (int b = 0; b <= budget; b++) {
            int remainingBudget = budget - b;
            int extraCopies = remainingBudget / minPrice;
            maxTotal = Math.max(maxTotal, dp[b] + extraCopies);
        }
        return maxTotal;
    }
}