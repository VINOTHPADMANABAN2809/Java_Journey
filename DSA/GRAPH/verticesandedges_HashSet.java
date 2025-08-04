package GRAPH;
import java.util.*;

class gra{
    Map<Integer, HashSet<Integer>> adj = new HashMap<>();

    public void addEdge(int u, int v){
        if(!adj.containsKey(u)){
            adj.put(u , new HashSet<>());
        }
        adj.get(u).add(v);

        if(!adj.containsKey(v)){
            adj.put(v, new HashSet<>());
        }
        adj.get(v).add(u);
    }

    public void addverticesedges(){
        int countvertices = adj.size();
        int countedges = 0;
        for(HashSet<Integer> a : adj.values()){
            countedges += a.size();
        }
        int sumedges = countedges / 2;

        System.out.println("Number of Vertices: "+countvertices);
        System.out.println("Number of Edges: "+sumedges);
    }

}

public class verticesandedges_HashSet{
    public static void main(String[] vk){
        gra g = new gra();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2,1);
        g.addEdge(3, 1);

        g.addverticesedges();

    }


}