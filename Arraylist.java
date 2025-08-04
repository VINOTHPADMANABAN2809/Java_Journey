import java.util.*;
class Arraylist{
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        // size of the arraylist
        int size = sc.nextInt();
        // declaration of the arraylist
        List<Integer> ls = new ArrayList<>();
        // arraylist input form user
        for(int i=0;i<size;i++){
            ls.add(sc.nextInt());
        }
        // print the array list with square bracket
        System.out.println(ls);
       // print the array list elements or without the square bracket
        for(int i=0;i<size;i++){
            System.out.println(ls.get(i)+" ");
        }

        // get the size of the arraylist
        System.out.println(ls.size());

        // sort the list
        Collections.sort(ls);

        System.out.println(ls);
        // reverse the array list
        Collections.reverse(ls);
        System.out.println(ls);
        sc.close();
    }
}