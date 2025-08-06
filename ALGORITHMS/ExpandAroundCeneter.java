package ALGORITHMS;
import java.util.*;
public class ExpandAroundCeneter{
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int start = 0;
        int maxlen = 0;

        if(s.length() == 0){
            System.out.println("Empty String");
            sc.close();
            return;
        }

        for(int i=0;i<s.length();i++){

            int left = i;
            int right = i;
            while(left>=0 && right <=s.length()-1 && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

            int len1 = right - left -1;

            left = i;
            right = i+1;
            while(left >= 0 && right <=s.length()-1 && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

            int len2 = right - left - 1;

            int len = Math.max(len1,len2);
            if(len > maxlen){
                maxlen = len;
                start = left+1;
            }


        }

        String res = s.substring(start,start + maxlen);
        System.out.println(res);






        sc.close();

    }
}
