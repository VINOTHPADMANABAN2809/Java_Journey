package DSA.MST.KRUSKALS;
import java.util.*;
class Edge{
    int s;
    int d;
    int w;
    Edge(int s,int d, int w){
        this.s = s;
        this.d = d;
        this.w = w;
    }
}


public class kruskals_algo_implementation {
    
    int[] parent;

    int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int x, int y){
        int px = find(x);
        int py = find(y);
        if(px == py) return false; // cycle detection
        parent[px] = py;
        return true;
    }
    
    public ArrayList<Edge> kruskals(ArrayList<Edge> edges, int v){
        parent = new int[v];
        for(int i=0;i<v;i++)  parent[i] = i;
        edges.sort(Comparator.comparingInt(e -> e.w));

        ArrayList<Edge> mst = new ArrayList<>();
        for(Edge e: edges){
            if(union(e.s,e.d)) mst.add(e);
            if(mst.size() == v-1) break;
        }
        return mst.size() == v-1 ? mst : new ArrayList<>();
    }


    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        List<Edge> edges = Arrays.asList(
            new Edge(0, 1, 2),
            new Edge(0, 3, 6),
            new Edge(1, 0, 2),
            new Edge(1, 3, 8),
            new Edge(1, 4, 5),
            new Edge(1, 2, 3),
            new Edge(2, 1, 3),
            new Edge(2, 4, 7),
            new Edge(3, 0, 6),
            new Edge(3, 1, 8),
            new Edge(4, 1, 5),
            new Edge(4, 2, 7)
        );
        sc.close();
        kruskals_algo_implementation k = new kruskals_algo_implementation();
        ArrayList<Edge> mst = k.kruskals(new ArrayList<>(edges), v);
        if(mst.isEmpty()){
            System.out.println("No MST found");
        } else {
            System.out.println("Edges in the MST:");
            for(Edge e: mst){
                System.out.println(e.s + " - " + e.d + " with weight " + e.w);
            }
        }
    }
}
