import java.util.*;
class armstrong{
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n, y = n;
        int digit = 0;
        int ans = 0;
        int sum = 0;
        while(x!=0){
            digit++;
            sum += x%10;
            x/=10;
        }

        while(y!=0){
            int temp = y%10;
            ans += Math.pow(temp,digit);
            y /= 10;
        }
        System.out.println(ans == n ? "1" : sum);
        sc.close();
    }
}