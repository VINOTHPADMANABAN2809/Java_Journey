package MST_Questions;

import java.util.*;

class display_adjacency_list_list {
    ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
    public display_adjacency_list_list(int vertices) {
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int w) {
        if (u < adj.size() && v < adj.size()) {
            adj.get(u).add(new int[]{v, w}); 
            adj.get(v).add(new int[]{u, w}); 
        }
    }

    public void print() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int[] edge : adj.get(i)) {
                System.out.print("(" + edge[0] + ", w:" + edge[1] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        display_adjacency_list_list g = new display_adjacency_list_list(3);
        g.addEdge(0, 1, 3);
        g.addEdge(0, 2, 6);
        g.addEdge(1, 2, 2);
        g.print();
    }
}