import java.util.*;
public class dijkstra_implementation_pq {
    static class pair {
        int v; 
        int w; 
        pair(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
    static void dijkstra(List<List<int[]>> adj, int v, int src) {
        int[] dist = new int[v]; 
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<pair> pq = new PriorityQueue<>(Comparator.comparing(a -> a.w));
        pq.offer(new pair(src, 0)); 
        while (!pq.isEmpty()) {
            pair current = pq.poll();
            int u = current.v;
            int d = current.w;
            if (d > dist[u]) continue; 
            for (int[] n : adj.get(u)) {
                int neighbor = n[0];
                int weight = n[1];
                if (dist[u] + weight < dist[neighbor]) {
                    dist[neighbor] = dist[u] + weight;
                    pq.offer(new pair(neighbor, dist[neighbor]));
                }
            }
        }
        System.out.println("Shortest distances from vertex " + src + ":");
        for (int i = 0; i < v; i++) {
            System.out.println("Vertex " + i + ": " + 
                (dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]));
        }
    }

    public static void main(String[] args) {
        int v = 5;
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new int[]{1, 2});
        adj.get(0).add(new int[]{3, 6}); 
        adj.get(1).add(new int[]{3, 8}); 
        adj.get(1).add(new int[]{4, 5}); 
        adj.get(1).add(new int[]{2, 3}); 
        adj.get(2).add(new int[]{4, 7}); 

        dijkstra(adj, v, 0); 
    }
}