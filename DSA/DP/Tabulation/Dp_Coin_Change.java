package DP.Tabulation;
public class Dp_Coin_Change {
    public static int countcoin(int[] coins, int amount){
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int coin : coins){
               for(int i= coin; i<=amount; i++){
                   dp[i] += dp[i-coin];
               }
           }
        return dp[amount];
    }
    public static void main(String[] vk){
        int [] coins = {1,2,5};
        int amount = 5;
        int result =countcoin(coins, amount);
        System.out.println(result);
    }
}
