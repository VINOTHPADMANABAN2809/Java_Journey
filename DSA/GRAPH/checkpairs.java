package GRAPH;
import java.util.*;

class pair{
    Map<Integer, HashSet<Integer>> adj  = new HashMap<>();

    public void addEdge(int u,int v){
        if(!adj.containsKey(u)){
            adj.put(u, new HashSet<>());
        }
        adj.get(u).add(v);
        if(!adj.containsKey(v)){
            adj.put(v, new HashSet<>());
        }
        adj.get(v).add(u);
    }

    public boolean pairexist(int u,int v){
            if(adj.containsKey(u) && adj.get(u).contains(v)){
                return true;
            }
            return false;
    }

    
    public void display(){
        for(int i=0;i<adj.size();i++){
           
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).toArray()[j] + " ");
            }
            System.out.println();
        }
    }
}


public class checkpairs{
    public static void main(String[] vk){
        pair p = new pair();
        p.addEdge(0, 1);
        p.addEdge(1,4);
        p.addEdge(1,0);
        p.addEdge(4,1);

        System.out.println(p.pairexist(1, 4));

        p.addEdge(2, 3);

        p.display();
    }
}