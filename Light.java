import java.util.*;
class Light{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = 0;
        for(int i=1; i<9; i++){
            arr[i] = sc.nextInt();
        }

        int[] res = arr.clone();
        for(int i=0;i<days;i++){
            for(int j=1;j<9;j++){
                if(arr[j-1]==arr[j+1]) res[j] = 0;
                else res[j] = 1;
            }
            arr = res.clone();
        }
        for(int i=1;i<9;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
        
    }
}