import java.util.*;
public class Str_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int d = sc.nextInt();
        char[] ch =  {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder res = new StringBuilder();
        while(q!=0){
            res.append(ch[q%d]);
            q/=d;
        }
        System.out.println(res);
        sc.close();
    }
}
