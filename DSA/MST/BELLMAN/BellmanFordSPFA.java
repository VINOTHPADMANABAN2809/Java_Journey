import java.util.*;

class Edge {
    int destination, weight;
    Edge(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

public class BellmanFordSPFA {
    private static final int INF = Integer.MAX_VALUE / 2;

    public static void spfa(int V, List<List<Edge>> adj, int source) {
        int[] dist = new int[V];
        Arrays.fill(dist, INF);
        dist[source] = 0;

        Queue<Integer> queue = new LinkedList<>();
        boolean[] inQueue = new boolean[V];
        int[] count = new int[V]; // For negative cycle detection

        queue.add(source);
        inQueue[source] = true;
        count[source] = 1;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            inQueue[u] = false;

            for (Edge edge : adj.get(u)) {
                int v = edge.destination;
                int w = edge.weight;
                if (dist[u] != INF && dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    if (!inQueue[v]) {
                        queue.add(v);
                        inQueue[v] = true;
                        count[v]++;
                        if (count[v] > V) {
                            System.out.println("Graph contains a negative-weight cycle");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": " + (dist[i] == INF ? "INF" : dist[i]));
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Example graph (same as your Bellman-Ford request)
        adj.get(0).add(new Edge(1, -1));
        adj.get(0).add(new Edge(2, 4));
        adj.get(1).add(new Edge(2, 3));
        adj.get(1).add(new Edge(3, 2));
        adj.get(1).add(new Edge(4, 2));
        adj.get(3).add(new Edge(2, 5));
        adj.get(3).add(new Edge(1, 1));
        adj.get(4).add(new Edge(3, -3));

        spfa(V, adj, 0);
    }
}