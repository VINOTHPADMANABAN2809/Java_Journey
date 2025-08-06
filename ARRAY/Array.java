package ARRAY;
import java.util.*;
public class Array {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        // size of the array
        int size = sc.nextInt();
        // 1D array declation
        int[] arr = new int[size];
        // get the elements in the array
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        // just print the array
        System.out.println(arr);
        // print the elements in the array
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // // sorting the array
        // Arrays.sort(arr);
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // // reverse an array
         sc.close();

    }
}
