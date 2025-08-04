package MST;

public class bruteforce_implementation {
    public static void main(String[] vk){
        char[] u = {'a','b','c'};
        char[] v = {'b','c','d'};
        int[] w = {4,2,5};

        int totalcost = 0;

        System.out.println("Minimium cost ways");

        System.out.println(u[0]+"-"+v[0]+":"+w[0]);
        totalcost += w[0];

        System.out.println(u[1]+"-"+v[1]+":"+w[1]);
        totalcost += w[1];

        System.out.println("Minimum cost of the tree is "+totalcost);
    }    
}

/*used when the input is low or the number of edges is low
this is a brute force implementation of minimum spanning tree
it is not efficient for large graphs */ 


