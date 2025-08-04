package MST.PRIMS;
import java.util.*;

public class primsalgo_implementation_pq {
    static class pair{
        int v;
        int w;
        int p;
        pair(int v,int w,int p){
            this.v = v;
            this.w = w;
            this.p = p;
        }
    }
    static void prims(List<List<int[]>> adj,int v){
        boolean[] visited = new boolean[v];
        PriorityQueue<pair> pq = new PriorityQueue<>(Comparator.comparing(a -> a.w));
        pq.offer(new pair(0,0,-1)); //0-index, -1-parent, 0-weight
        int cost = 0;
        System.out.println("Edges of MST: ");
        while(!pq.isEmpty()){
            pair current = pq.poll();
            if(visited[current.v]) continue;
            visited[current.v] = true;
            if(current.p != -1){
                System.out.println("Edge: " + current.p + " - " + current.v + " with weight: " + current.w);
            }
            cost += current.w;
            for(int[] n: adj.get(current.v)){
                if(!visited[n[0]]){
                    pq.offer(new pair(n[0], n[1], current.v));
                }
            }
            System.out.println("Current cost: " + cost);
        }
    }
    public static void main(String[] vk){
        int v  = 5; // Number of vertices
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new int[]{1, 2});
        adj.get(1).add(new int[]{0, 2});
        
        adj.get(0).add(new int[]{3, 6});
        adj.get(3).add(new int[]{0, 6});
        
        adj.get(1).add(new int[]{3, 8});
        adj.get(3).add(new int[]{1, 8});
        
        adj.get(1).add(new int[]{4, 5});
        adj.get(4).add(new int[]{1, 5});
        
        adj.get(1).add(new int[]{2, 3});
        adj.get(2).add(new int[]{1, 3});
        
        adj.get(2).add(new int[]{4, 7});
        adj.get(4).add(new int[]{2, 7});

        prims(adj, v);
    }
}
