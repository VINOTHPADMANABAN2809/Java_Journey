package DP.Tabulation;
public class Dp_fibo_sum{

    public static int fib(int n){
        if(n<=1){ //base case
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] vk){
        System.out.println(fib(10));
    }
}
