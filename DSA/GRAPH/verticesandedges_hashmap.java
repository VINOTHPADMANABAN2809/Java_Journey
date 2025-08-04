package GRAPH;
import java.util.*;
class gr{
    Map<Integer,ArrayList<Integer>> adj = new HashMap<>();

    public void addEdge(int u,int v){
        if(!adj.containsKey(u)){
            adj.put(u, new ArrayList<>());
        }
        adj.get(u).add(v);
        if(!adj.containsKey(v)){
            adj.put(v, new ArrayList<>());
        }
        adj.get(v).add(u);
    }

    public void addverticesedges(){
        int countverties = adj.size();
        int countedges = 0;
        for(List<Integer> a : adj.values()){
            countedges += a.size();
        }
        int sum = countedges / 2;

        System.out.println("Number of vertices: " + countverties);
        System.out.println("Number of edges: " + sum);
    }
}
public class verticesandedges_hashmap {
    public static void main(String[] vk){
        gr g = new gr();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.addverticesedges();
    }
}
