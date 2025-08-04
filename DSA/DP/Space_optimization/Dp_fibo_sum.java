package DP.Space_optimization;



public class Dp_fibo_sum {
    public static void fib(int n){
        
        int f = 0;
        int s = 1;
        System.out.print(f+" ");
        for(int i=2;i<=n;i++){
            int t = f+s;
            f = s;
            s = t;
            System.out.print(f+" ");
        }
        System.out.print(s+" ");
    }
    public static void main(String[] vk){
        fib(10);

    }
}
