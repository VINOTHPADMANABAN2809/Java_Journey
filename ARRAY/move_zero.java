package ARRAY;
import java.util.*;
public class move_zero {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                a.add(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                a.add(arr[i]);
            }
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = a.get(i);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
}
