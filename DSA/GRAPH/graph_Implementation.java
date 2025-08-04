package GRAPH;
import java.util.ArrayList;

class Graph{

    ArrayList<ArrayList<Integer>> as = new ArrayList<>();

    Graph(int n){
        for(int i=0;i<n;i++){
            as.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v){
        
            as.get(u).add(v);
            as.get(v).add(u);
    }
    public void display(){
        for(int i=0;i<as.size();i++){
            System.out.println("Vertex " + i + " is connected to: ");
            for(int j=0;j<as.get(i).size();j++){
                System.out.print(as.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

public class graph_Implementation{
    public static void main(String[] vk){
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1,0);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        g.display();

    }
}