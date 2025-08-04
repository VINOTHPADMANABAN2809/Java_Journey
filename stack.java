import java.util.*;
public class stack{
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        //Stack<Integer> st = new Stack<>();
        // for(int i=0;i<n;i++){
        //     st.push(sc.nextInt());
        // }

        // System.out.println(st);
        // System.out.println(st.peek());
        // st.pop();
        //  System.out.println(st);
        //  st.pop();
        //  System.out.println(st);
        //  st.pop();
        //  System.out.println(st);
        //  st.pop();
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            st.push(ch[i]);
        }
        System.out.println(st);
        sc.close();
        
    }
}