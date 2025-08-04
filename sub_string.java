import java.util.*;
public class sub_string {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                System.out.println(sub);
            }
        }
        sc.close();
    }
   
}
