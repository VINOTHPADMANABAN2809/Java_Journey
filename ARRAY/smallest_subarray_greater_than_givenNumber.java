package ARRAY;
import java.util.*;
public class smallest_subarray_greater_than_givenNumber {
    
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        
        int minlen = n+1;
        
        
        for(int i=0;i<n;i++){
            int curr_sum = arr[i];
            if(curr_sum > x){
                minlen = 1;
                break;
            }
            for(int j=i+1;j<n;j++){
                curr_sum += arr[j];
                if(curr_sum > x && j-i+1< minlen) {
                    minlen = j-i+1;
                }
            }
            
        }
        System.out.println(minlen>n?"Not Possible":minlen);
        sc.close();
    }
}

