/*
Alice and Bob continue their games with piles of stones. There are several stones arranged in a row, and each stone has an associated value which is an integer given in the array stoneValue.

Alice and Bob take turns, with Alice starting first. On each player's turn, that player can take 1, 2, or 3 stones from the first remaining stones in the row.

The score of each player is the sum of the values of the stones taken. The score of each player is 0 initially.

The objective of the game is to end with the highest score, and the winner is the player with the highest score and there could be a tie. The game continues until all the stones have been taken.

Assume Alice and Bob play optimally.

Return "Alice" if Alice will win, "Bob" if Bob will win, or "Tie" if they will end the game with the same score.

*/
class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[3];

        for (int i = n - 1; i >= 0; i--) {
            int takeOne = stoneValue[i] - dp[(i + 1) % 3];

            int takeTwo = Integer.MIN_VALUE;
            if (i + 1 < n)
                takeTwo = stoneValue[i] + stoneValue[i + 1] - dp[(i + 2) % 3];

            int takeThree = Integer.MIN_VALUE;
            if (i + 2 < n)
                takeThree = stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2]  - dp[(i + 3) % 3];

            dp[i % 3] = Math.max(Math.max(takeOne, takeTwo), takeThree);
        }
        if (dp[0]> 0)
            return "Alice";
        else if (dp[0]< 0)
            return "Bob";
        else
            return "Tie";
    }
}
